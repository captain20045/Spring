package com.project04.mapper;

import com.project04.domain.UserRoute;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRouteMapper {
    @Insert("INSERT INTO user_route (userid, b_mark, c_mark, b_latitude, b_longitude, c_latitude, c_longitude) " +
            "VALUES (#{userid}, #{b_mark}, #{c_mark}, #{b_latitude}, #{b_longitude}, #{c_latitude}, #{c_longitude})")
    boolean addRoute(UserRoute route);
    
    @Select("SELECT route_seq, userid, b_mark, c_mark, b_latitude, b_longitude, c_latitude, c_longitude FROM user_route WHERE userid = #{userid}")
    List<UserRoute> findAllRoutesByUserId(String userid);
    
    @Delete("DELETE FROM user_route WHERE userid = #{userid} and route_seq = #{route_seq}")
    boolean deleteUserRoute(UserRoute route_d);
}
