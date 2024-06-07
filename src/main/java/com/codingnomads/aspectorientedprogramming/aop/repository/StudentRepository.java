/* CodingNomads (C)2024 */
package com.codingnomads.aspectorientedprogramming.aop.repository;

import com.codingnomads.aspectorientedprogramming.aop.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}
