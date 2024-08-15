package com.codingnomads.corespring.examples.autowiredannotation;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("magic")
@ToString
public class MagicKeyboard implements Keyboard{
}
