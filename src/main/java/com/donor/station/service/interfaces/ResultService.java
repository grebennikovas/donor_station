package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Result;

import java.util.List;

public interface ResultService {
    Result add(Result result);
    void delete(long id);
    Result getById(Long id);
    Result edit(Result result);
    List<Result> getAll();
}
