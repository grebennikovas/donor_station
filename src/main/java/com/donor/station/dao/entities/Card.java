package com.donor.station.dao.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "card", schema = "donor_station")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @Column(name="id",length = 16,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="f_name", nullable = false)
    private String f_name;
    @Column(name="l_name", nullable = false)
    private String l_name;
    @Column(name="p_name", nullable = true)
    private String p_name;
    @Column(name="birthday", nullable = false)
    private Date birthday;
    @Column(name="pas_series", nullable = false)
    private int pas_series;
    @Column(name="pas_number", nullable = false)
    private int pas_number;
    @ManyToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "blood_id", nullable = false)
    private Blood_type blood_type;
    @ManyToOne(cascade = CascadeType.ALL, optional=false, fetch = FetchType.EAGER)
    @JoinColumn(name = "rh_id", nullable = false)
    private Rh_type rh_type;
}
