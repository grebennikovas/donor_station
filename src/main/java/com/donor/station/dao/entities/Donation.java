package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "donation", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Donation {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "don_id", nullable = false)
    Donation_type donation_type;
    @ManyToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "result_id", nullable = false)
    Result result;
}
