package com.donor.station.service.impl;

import com.donor.station.dao.entities.Donation;
import com.donor.station.dao.repos.DonationRepository;
import com.donor.station.service.interfaces.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonationServiceImpl implements DonationService {
    @Autowired
    DonationRepository repository;

    @Override
    public Donation add(Donation donation) {
        return repository.saveAndFlush(donation);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Donation getById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Donation edit(Donation donation) {
        return repository.saveAndFlush(donation);
    }

    @Override
    public List<Donation> getAll() {
        return repository.findAll();
    }
}
