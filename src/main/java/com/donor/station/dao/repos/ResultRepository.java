package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Result;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result,Long> {

    @Query("select r,t,c,rh,b from Result r " +
            "left join Test t on r.test.id=t.id " +
            "left join Card c on t.card.id=c.id " +
            "left join Rh_type rh on c.rh_type.id=rh.id " +
            "left join Blood_type b on c.blood_type.id=b.id"
    )
    @EntityGraph(value = "Result.default")
    List<Result> findAll();
}
