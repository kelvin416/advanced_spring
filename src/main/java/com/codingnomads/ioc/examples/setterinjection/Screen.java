package com.codingnomads.ioc.examples.setterinjection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Screen {

    public String name;
    public String type;
}
