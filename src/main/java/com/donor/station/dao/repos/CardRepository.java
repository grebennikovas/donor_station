package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    @Query("select f from Card f where f.rh_id=:rh")
    List<Card> getByRh(@Param("rh") int rh);
}
