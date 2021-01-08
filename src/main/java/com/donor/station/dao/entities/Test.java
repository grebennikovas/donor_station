package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "test", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "test_time",nullable = false)
    LocalDateTime test_time;
    @OneToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "card_id", nullable = false)
    Card card;
}
