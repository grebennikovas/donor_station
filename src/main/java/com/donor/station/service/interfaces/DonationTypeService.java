package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Donation_type;

import java.util.List;

public interface DonationTypeService {
    List<Donation_type> getById(Long id);
    List<Donation_type> getAll();
}
