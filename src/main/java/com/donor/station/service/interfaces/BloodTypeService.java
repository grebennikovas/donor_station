package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Blood_type;

import java.util.List;

public interface BloodTypeService {
    List<Blood_type> getAll();
    List<Blood_type> getById(long id);
    Blood_type editBloodType(Blood_type bt);
    Blood_type addBloodType(Blood_type bt);
    void deleteBlodType(long id);
}
