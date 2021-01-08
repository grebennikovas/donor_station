package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Result_type;

import java.util.List;

public interface ResultTypeService {
    Result_type add(Result_type result_type);
    void delete(long id);
    List<Result_type> getById(Long id);
    Result_type edit(Result_type result_type);
    List<Result_type> getAll();
}
