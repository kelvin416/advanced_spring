package com.codingnomads.corespring.examples.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Student {

    @Bean
    SpringDeveloper springDeveloper(){
        return new SpringDeveloper();
    }
}
