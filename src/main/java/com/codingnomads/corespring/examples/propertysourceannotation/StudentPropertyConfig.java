package com.codingnomads.corespring.examples.propertysourceannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = "student.properties", ignoreResourceNotFound = true)
public class StudentPropertyConfig {
}
