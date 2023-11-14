package com.project04.service;

import com.project04.mapper.UserRouteMapper;
import com.project04.domain.UserRoute;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRouteService {

    @Autowired
    private UserRouteMapper userrouteMapper;

    // 데이터베이스에 사용자를 추가하는 메서드
    public boolean addRoute(UserRoute route) {
        // 데이터베이스에 사용자 추가 로직 구현
        return userrouteMapper.addRoute(route);
    }
    
    public List<UserRoute> getUserRoutes(String userid) {
        return userrouteMapper.findAllRoutesByUserId(userid);
    }
    
    public boolean deleteUserRoute(UserRoute route_d) {
        return userrouteMapper.deleteUserRoute(route_d);
    }
}
