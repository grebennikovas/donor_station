package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "blood_type", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blood_type {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="blood_name", nullable = false)
    private String blood_name;
}
