package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "result", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id", nullable = false)
    Test test;
    String description;
    @ManyToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "res_id", nullable = false)
    Result_type result_type;
}
