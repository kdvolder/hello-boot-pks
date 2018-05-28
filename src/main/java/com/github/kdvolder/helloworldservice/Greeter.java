package com.github.kdvolder.helloworldservice;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

    private static final String changeme = "Wooot";

    String greeting(String name) {
        return changeme+name;
    }

}