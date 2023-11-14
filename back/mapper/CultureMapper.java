package com.project04.mapper;

import com.project04.domain.Culture;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CultureMapper {

    @Select("SELECT DISTINCT culture_name, c_latitude, c_longitude FROM culture WHERE culture_address LIKE CONCAT('%', #{district}, '%')")
    List<Culture> findCultureByAddress(String district);
}

