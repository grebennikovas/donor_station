package com.donor.station.dao.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "blood_type", schema = "donor_station")
@Data
@Getter
@NoArgsConstructor
public class Blood_type {
    @Id
    @Column(name="id",nullable = false)
    private long id;

    @Column(name="blood_name", nullable = false)
    private String blood_name;
}
