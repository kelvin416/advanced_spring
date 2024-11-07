package com.codingnomads.springdata.example.dml.derivedquerymethods.myexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootApplication
public class CarApplication implements CommandLineRunner {

    @Autowired
    CarRepo carRepo;

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        Car bently = Car.builder().name("Bently").carAge(3).topSpeed(300).isRoadWorthy(true).build();
        Car toyota = Car.builder().name("Toyota Prado").carAge(7).topSpeed(180).isRoadWorthy(true).build();
        Car mitsubishi = Car.builder().name("Mitsubishi Pajero").carAge(20).topSpeed(180).isRoadWorthy(false).build();
        Car benz = Car.builder().name("Mercedes-Benz").carAge(1).topSpeed(300).isRoadWorthy(true).build();
        Car ferrari = Car.builder().name("Ferrari").carAge(10).topSpeed(400).isRoadWorthy(false).build();
        Car jaguar = Car.builder().name("Jaguar Land Rover").carAge(4).topSpeed(180).isRoadWorthy(true).build();
        Car audi = Car.builder().name("Audi Q7").carAge(2).topSpeed(220).isRoadWorthy(true).build();
        Car porsche = Car.builder().name("Porsche Cayenne").carAge(6).topSpeed(260).isRoadWorthy(true).build();

        carRepo.saveAll(List.of(bently, toyota, mitsubishi, benz, ferrari, jaguar, audi, porsche));

        carRepo.flush();

        System.out.println("\n -----------findByName-----------");
        List<Car> cars1 = carRepo.findByName("Ferrari");
        cars1.forEach(System.out::println);

        System.out.println("\n-----------findByIsRoadWorthy-----------");
        List<Car> cars2 = carRepo.findByIsRoadWorthy(true);
        cars2.forEach(System.out::println);

        System.out.println("\n-----------findByNameStartingWith-----------");
        List<Car> cars3 = carRepo.findByNameStartingWith("M");
        cars3.forEach(System.out::println);

        System.out.println("\n-----------findByNameEndingWith-----------");
        List<Car> cars4 = carRepo.findByNameEndingWith("o");
        cars4.forEach(System.out::println);

        System.out.println("\n-----------findByCarAgeLessThan-----------");
        List<Car> cars5 = carRepo.findByCarAgeLessThan(4);
        cars5.forEach(System.out::println);

        System.out.println("\n-----------findByTopSpeed-----------");
        Car cars6 = carRepo.findFirstByTopSpeedGreaterThan(220);
        System.out.println(cars6.toString());

        PageRequest pageRequest = PageRequest.of(0, 4);

        System.out.println("---------FIRST PAGE---------");
        Page<Car> page = carRepo.findAll(pageRequest);
        page.getContent().forEach(System.out::println);

        System.out.println("---------Second PAGE---------");
        page = carRepo.findAll(pageRequest.next());
        page.getContent().forEach(System.out::println);

        carRepo.deleteAllInBatch();
    }
}
