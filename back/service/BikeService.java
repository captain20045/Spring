package com.project04.service;

import com.project04.mapper.BikeMapper;
import com.project04.domain.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {

    @Autowired
    private BikeMapper bikeMapper;

    public List<String> getAllDistricts() {
        return bikeMapper.findAllDistricts();
    }

    public List<String> getNeighborhoodsByDistrict(String district) {
        return bikeMapper.findNeighborhoodsByDistrict(district);
    }

    public List<Bike> findBikeLocations(String district, String neighborhood) {
        return bikeMapper.findBikeLocationsByDistrictAndNeighborhood(district, neighborhood);
    }

    // 추가적인 CRUD 작업 메소드는 여기에 추가할 수 있습니다.
}
