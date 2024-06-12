/* CodingNomads (C)2024 */
package com.codingnomads.ioc.examples.dependencylookup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOCDemoConfiguration {

    @Bean
    public GreetingProvider provider() {
        return new CodingNomadsGreetingProvider();
    }

    @Bean
    public GreetingProvider computerProvider(){
        return new ComputerType();
    }

    @Bean
    public GreetingRenderer renderer() {
        GreetingRenderer renderer = new StandardOutGreetingRenderer();
        renderer.setGreetingProvider(provider());
        return renderer;
    }

    @Bean
    public GreetingRenderer rendererProvider(){
        GreetingRenderer renderer2 = new StandardOutGreetingRenderer();
        renderer2.setGreetingProvider(computerProvider());
        return renderer2;
    }
}
