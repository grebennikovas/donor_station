package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Donation;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {

    @Query("select d,r,t,c,rh,b,rt from Donation d " +
            "left join Result r on d.result.id=r.id " +
            "left join Test t on r.test.id=t.id " +
            "left join Card c on t.card.id=c.id " +
            "left join Rh_type rh on c.rh_type.id=rh.id " +
            "left join Blood_type b on c.blood_type.id=b.id " +
            "left join Result_type rt on r.result_type.id=rt.id"
    )
    @EntityGraph(value = "Donation.default")
    List<Donation> findAll();
}
