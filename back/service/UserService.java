package com.project04.service;

import com.project04.mapper.UserMapper;
import com.project04.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 데이터베이스에 사용자를 추가하는 메서드
    public boolean addUser(User user) {
        // 데이터베이스에 사용자 추가 로직 구현
        return userMapper.addUser(user);
    }

    // 사용자 로그인을 처리하는 메서드
    public int getLogin(String userid, String userpw) {
        // 데이터베이스에서 사용자 정보를 조회하고, 비밀번호가 일치하는지 확인하는 로직 구현
        User user = userMapper.findUserByUserId(userid);
        if (user != null && user.getUserpw().equals(userpw)) {
            return 1; // 로그인 성공
        }
        return 0; // 로그인 실패
    }
    
    public User getUserDetails(String userid) {
        return userMapper.findUserByUserId(userid);
    }

    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }
    
    public boolean deleteUser(String userid) {
        return userMapper.deleteUser(userid);
    }

}
