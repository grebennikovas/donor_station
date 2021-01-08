package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "donation_type", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Donation_type {

    @Id
    @Column(name="id",nullable = false)
    Long id;
    String donation_name;
}
