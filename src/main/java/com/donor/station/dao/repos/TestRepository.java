package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {

    @Query("select t,c,r,b from Test t left join Card c on t.card.id=c.id " +
           "left join Rh_type r on c.rh_type.id=r.id " +
           "left join Blood_type b on c.blood_type.id=b.id"
    )
    List<Test> findAll();

}
