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
    long id;
    String f_name;
    String l_name;
    String p_name;
    Date birthday;
    int pas_series;
    int pas_number;
    int rh_id;
    int blood_id;

}
