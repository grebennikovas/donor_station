package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "rh_type", schema = "donor_station")
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Rh_type {
    @Id
    @GeneratedValue
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="rh_name", nullable = false)
    private String rh_name;
}
