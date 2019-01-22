/***********************************************************************
 *********************************CONFIDENTIAL**************************
 ***********************************************************************/

package com.springpagination.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="actor")
public class Actor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer actorId;
    private String firstName;
    private String lastName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate lastUpdate;
}

//247
//Alberta