package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Result_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultTypeRepository extends JpaRepository<Result_type,Long> {
}
