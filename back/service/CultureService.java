package com.project04.service;

import com.project04.mapper.CultureMapper;
import com.project04.domain.Culture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CultureService {
	
    @Autowired
    private CultureMapper cultureMapper;
    
	
    public List<Culture> findCultureByAddress(String district) {
        // Implement the logic to retrieve culture information for a given address
        return cultureMapper.findCultureByAddress(district);
    }

}
