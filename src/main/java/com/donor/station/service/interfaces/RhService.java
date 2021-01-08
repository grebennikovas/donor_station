package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Rh_type;

import java.util.List;

public interface RhService {
    List<Rh_type> getById(long id);
    Rh_type editBloodType(Rh_type bt);
    Rh_type addBloodType(Rh_type bt);
}
