package com.codingnomads.springdata.example.ddl.onetoone.bidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Name of Team")
@NoArgsConstructor
@Getter
@Setter
public class TeamName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    private Car car;


}
