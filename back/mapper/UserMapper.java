package com.project04.mapper;

import com.project04.domain.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user_register (userid, userpw, name, gender, address, phone_number, regdate) " +
            "VALUES (#{userid}, #{userpw}, #{name}, #{gender}, #{address}, #{phone_number}, #{regdate})")
    boolean addUser(User user);
    
    @Select("SELECT * FROM user_register WHERE userid = #{userid}")
    User findUserByUserId(String userid);

    @Update("UPDATE user_register SET userpw=#{userpw}, name=#{name}, gender=#{gender}, address=#{address}, phone_number=#{phone_number} WHERE userid=#{userid}")
    boolean updateUser(User user);
    
    @Delete("DELETE FROM user_register WHERE userid = #{userid}")
    boolean deleteUser(String userid);

}
