package com.codingnomads.springdata.example.dml.derivedquerymethods.myexample;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer carAge;

    private Integer topSpeed;

    private boolean isRoadWorthy;


}


