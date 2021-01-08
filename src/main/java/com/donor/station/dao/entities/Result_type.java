package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "result_type", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result_type {
    @Id
    @Column(name="id",nullable = false)
    Long id;
    String result_name;
}
