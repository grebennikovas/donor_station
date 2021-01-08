package com.donor.station.service.impl;

import com.donor.station.dao.entities.Test;
import com.donor.station.dao.repos.TestRepository;
import com.donor.station.service.interfaces.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestRepository repository;

    @Override
    public Test add(Test test) {
        return repository.saveAndFlush(test);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Test getById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Test edit(Test test) {
        return repository.saveAndFlush(test);
    }

    @Override
    public List<Test> getAll() {
        return repository.findAll();
    }
}
