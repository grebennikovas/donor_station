package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Test;

import java.util.List;

public interface TestService {
    Test add(Test test);
    void delete(long id);
    Test getById(Long id);
    Test edit(Test test);
    List<Test> getAll();
}
