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
    public List<Blood_type> getById(long id) {
        return bloodTypeRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public Blood_type editBloodType(Blood_type bt) {
        return bloodTypeRepository.saveAndFlush(bt);
    }

    @Override
    public Blood_type addBloodType(Blood_type bt) {
        Blood_type new_bt = bloodTypeRepository.saveAndFlush(bt);
        return new_bt;
    }

    @Override
    public void deleteBlodType(long id) {
        bloodTypeRepository.deleteById(id);
    }
}
