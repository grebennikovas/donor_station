package com.donor.station.dao.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name= "card", schema = "donor_station")
@Data
@Getter
/*@Setter
@AllArgsConstructor*/
@NoArgsConstructor
public class Card implements Serializable {

    @Id
    @Column(name="id",length = 16,nullable = false)
    long id;
    @Column(name="f_name")
    String f_name;
    @Column(name="l_name")
    String l_name;
    @Column(name="p_name")
    String p_name;
    @Column(name="birthday")
    Date birthday;
    @Column(name="pas_series")
    int pas_series;
    @Column(name="pas_number")
    int pas_number;
    @Column(name="rh_id")
    int rh_id;
    @Column(name="blood_id")
    int blood_id;

}
