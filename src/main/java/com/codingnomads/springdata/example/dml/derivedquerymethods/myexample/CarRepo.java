package com.codingnomads.springdata.example.dml.derivedquerymethods.myexample;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepo extends JpaRepository<Car, Long> {

    List<Car> findByName(String name);

    List<Car> findByNameIsNot(String name);

    List<Car> findByIsRoadWorthy(boolean isRoadWorthy);

    List<Car> findByIsRoadWorthyIsNot(boolean isRoadWorthy);

    List<Car> findByNameStartingWith(String namePrefix);

    List<Car> findByNameEndingWith(String nameSuffix);

    List<Car> findByCarAgeLessThan(int carAge);

    List<Car> findByCarAgeGreaterThan(int carAge);

    Car findFirstByTopSpeedGreaterThan(int topSpeed);

    List<Car> findTop3ByTopSpeedLessThan(int topSpeed);

}
