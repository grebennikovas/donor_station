package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "donation", schema = "donor_station")
@Data
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = "Donation.default",
                attributeNodes = {
                        @NamedAttributeNode(value = "donation_type"),
                }
        )
})
public class Donation {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne(cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "don_id", nullable = false)
    Donation_type donation_type;
    @ManyToOne(cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "result_id", nullable = false)
    Result result;
}
