package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "result", schema = "donor_station")
@Data
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = "Result.default",
                attributeNodes = {
                        @NamedAttributeNode(value = "result_type")
                }
        )
})
public class Result {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne(cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "test_id", nullable = false)
    Test test;
    String description;
    @ManyToOne(cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "res_id", nullable = false)
    Result_type result_type;
}
