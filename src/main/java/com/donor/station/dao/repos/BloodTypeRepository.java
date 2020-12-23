package com.donor.station.dao.repos;


import com.donor.station.dao.entities.Blood_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodTypeRepository extends JpaRepository<Blood_type, Long> {
}
