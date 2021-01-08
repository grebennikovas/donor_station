package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    @Query("select c from Card c where c.rh_type.id=:rh")
    List<Card> RhFilter(@Param("rh") Long rh);

    @Query("select c from Card c where c.blood_type.id=:blood")
    List<Card> BloodFilter(@Param("blood") Long blood);
}
