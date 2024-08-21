package com.codingnomads.corespring.examples.profileannotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("deploy")
public class OfficePoint {

    public OfficePoint(){
        System.out.println("Office Point is ready");
    }
}
