package com.donor.station.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "test", schema = "donor_station")
@Data
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = "Test.default",
                attributeNodes = {
                        @NamedAttributeNode(value = "card"),
                },
                subgraphs = {
                        @NamedSubgraph(name = "Card.default", attributeNodes = {
                                @NamedAttributeNode(value = "blood_type"),
                                @NamedAttributeNode(value = "rh_type")
                        })
                }
        )
})
public class Test {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "test_time",nullable = false)
    LocalDateTime test_time;
    @OneToOne(cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "card_id", nullable = false)
    Card card;
}
