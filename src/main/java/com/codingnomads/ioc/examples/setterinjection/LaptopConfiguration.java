/* CodingNomads (C)2024 */
package com.codingnomads.ioc.examples.setterinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codingnomads.ioc.examples.setterinjection")
public class LaptopConfiguration {
    @Bean
    public Processor processor() {
        return new Processor(8, "i9");
    }

    @Bean
    public OS os() {
        return new OS("ubuntu");
    }

    @Bean
    public Screen screen(){
        return new Screen("HP", "LED");
    }
}
