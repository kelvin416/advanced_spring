/* CodingNomads (C)2024 */
package com.codingnomads.springdata.example.dml.lifecyclecallback;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PrintEntity {

    @Id
    @GeneratedValue
    private Long id;

    // write your methods here

    @PostLoad
    private void successRate(){
        System.out.println("The Success Rate was 80%");
    }

    @PrePersist
    private void timeSpentProcessing(){
        System.out.println("Time Spent processing was 50s");
    }

    @PreUpdate
    private void errorsCaught(){
        System.out.println("Errors caught and fixed: 3");
    }

}
