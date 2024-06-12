package com.codingnomads.ioc.examples.dependencylookup;

public class ComputerType implements GreetingProvider{
    @Override
    public String getGreeting() {
        return "This is greeting from MacOs X";
    }
}
