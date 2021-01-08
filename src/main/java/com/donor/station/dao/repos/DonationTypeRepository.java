package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Donation_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationTypeRepository extends JpaRepository<Donation_type,Long> {
}
