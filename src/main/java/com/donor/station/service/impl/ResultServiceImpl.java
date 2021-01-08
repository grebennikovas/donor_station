package com.donor.station.service.impl;

import com.donor.station.dao.entities.Result;
import com.donor.station.dao.repos.ResultRepository;
import com.donor.station.service.interfaces.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    ResultRepository repository;

    @Override
    public Result add(Result result) {
        return repository.saveAndFlush(result);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Result getById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Result edit(Result result) {
        return repository.saveAndFlush(result);
    }

    @Override
    public List<Result> getAll() {
        return repository.findAll();
    }
}
