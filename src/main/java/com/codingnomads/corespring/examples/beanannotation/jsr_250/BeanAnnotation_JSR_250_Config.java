/* CodingNomads (C)2024 */
package com.codingnomads.corespring.examples.beanannotation.jsr_250;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAnnotation_JSR_250_Config {
    @Bean
    public SampleBean sampleBean() {
        return new SampleBean();
    }
}
