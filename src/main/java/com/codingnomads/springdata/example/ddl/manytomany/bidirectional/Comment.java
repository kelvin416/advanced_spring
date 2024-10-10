/* CodingNomads (C)2024 */
package com.codingnomads.springdata.example.ddl.manytomany.bidirectional;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, updatable = false)
    private String username;

    @Column(nullable = false)
    private String content;

    //setting up a many to many relationship with the Like class
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Like> likes;
}
