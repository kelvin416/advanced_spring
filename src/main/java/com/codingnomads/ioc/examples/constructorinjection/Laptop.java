/* CodingNomads (C)2024 */
package com.codingnomads.ioc.examples.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private Processor processor;
    private OS os;

    private KeyBoardType keyBoardType;

    // these fields are being injected from the ApplicationContext
    // if a class contains only one constructor (as this one does), the use of @Autowired is optional
    // if a class contains two or more constructors, @Autowired is required for constructor injection to take place
    public Laptop(Processor processor, OS os, KeyBoardType keyBoardType) {
        this.processor = processor;
        this.os = os;
        this.keyBoardType = keyBoardType;
    }

    public String printLaptopConfiguration() {
        return "processor: " + processor.getCore() + " core " + processor.getName() + "\nOS: " + os.getName()
                + "\nprice: " + keyBoardType.getPrice() + " keyboard type:" + keyBoardType.getName();
    }
}
