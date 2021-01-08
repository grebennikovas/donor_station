package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Rh_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhTypeRepository extends JpaRepository<Rh_type,Long> {
}
