package com.donor.station.service.impl;

import com.donor.station.dao.entities.Blood_type;
import com.donor.station.dao.repos.BloodTypeRepository;
import com.donor.station.service.interfaces.BloodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BloodTypeServiceImpl implements BloodTypeService {
    @Autowired
    BloodTypeRepository bloodTypeRepository;

    @Override
    public List<Blood_type> getAll() {
        return bloodTypeRepository.findAll();
    }

    @Override
    public Blood_type getById(long id) {
        return bloodTypeRepository.getOne(id);
    }

}
