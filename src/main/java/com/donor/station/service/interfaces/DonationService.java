package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Donation;

import java.util.List;

public interface DonationService {
    Donation add(Donation donation);
    void delete(long id);
    Donation getById(Long id);
    Donation edit(Donation donation);
    List<Donation> getAll();
}
