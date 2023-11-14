package com.project04.mapper;

import com.project04.domain.Bike;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BikeMapper {

    @Select("SELECT DISTINCT addr1 FROM address")
    List<String> findAllDistricts();

    @Select("SELECT addr2 FROM address WHERE addr1 = #{district}")
    List<String> findNeighborhoodsByDistrict(String district);

    @Select("SELECT bike_id, bike_addr1, latitude, longitude FROM bike WHERE bike_addr1 LIKE CONCAT('%', #{district}, '%') AND bike_addr1 LIKE CONCAT('%', #{neighborhood}, '%')")
    List<Bike> findBikeLocationsByDistrictAndNeighborhood(@Param("district") String district, @Param("neighborhood") String neighborhood);

}
