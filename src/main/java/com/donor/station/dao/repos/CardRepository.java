package com.donor.station.dao.repos;

import com.donor.station.dao.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    /*@Query("select b from Card b where Card.f_name = :f_name and Card.l_name=:l_name")
    Card findByName(@Param("f_name") String f_name, @Param("l_name") String name);*/
}
