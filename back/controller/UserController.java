package com.project04.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import com.project04.domain.User;
import com.project04.service.UserService;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") // 세션을 위해 credentials 허용
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/registerAction")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        boolean result = userService.addUser(user);
        if (result) {
            return ResponseEntity.ok().body(Map.of("success", true));
        } else {
            return ResponseEntity.badRequest().body(Map.of("success", false));
        }
    }

    @PostMapping("/loginAction")
    public ResponseEntity<?> loginAction(@RequestBody Map<String, String> credentials, HttpSession session) {
        String userid = credentials.get("userid");
        String userpw = credentials.get("userpw");
        
        int logingubun = userService.getLogin(userid, userpw);
        if (logingubun == 1) {
            // 세션에 사용자 ID 저장
            session.setAttribute("LOGIN_USER_ID", userid);
            return ResponseEntity.ok().body(Map.of("success", true));
        } else {
            // 로그인 실패 응답
            return ResponseEntity.badRequest().body(Map.of("success", false));
        }
    }
    
    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
        // 세션을 무효화합니다.
        request.getSession().invalidate();
        // 클라이언트에게 성공적으로 로그아웃했다는 응답을 보냅니다.
        return ResponseEntity.ok().body(Map.of("success", true, "message", "성공적으로 로그아웃 되었습니다."));
    }
    
    @GetMapping("/user/details/{userid}")
    public ResponseEntity<?> getUserDetails(@PathVariable("userid") String userid) {
        User user = userService.getUserDetails(userid);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/user/update")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        boolean isUpdated = userService.updateUser(user);
        if (isUpdated) {
            return ResponseEntity.ok().body(Map.of("message", "회원 정보가 수정되었습니다"));
        } else {
            return ResponseEntity.badRequest().body(Map.of("message", "회원 정보가 수정실패"));
        }
    }
    
    @DeleteMapping("/user/delete/{userid}")
    public ResponseEntity<?> deleteUser(@PathVariable String userid) {
        boolean isDeleted = userService.deleteUser(userid);
        if (isDeleted) {
            return ResponseEntity.ok().body(Map.of("message", "회원탈퇴 되었습니다"));
        } else {
            return ResponseEntity.badRequest().body(Map.of("message", "Failed to delete user"));
        }
    } 
}
