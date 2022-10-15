package org.quickstart.functions;

import io.quarkus.funqy.Funq;

public class HelloFunction {

    @Funq
    public String helloFunction() {
        return "Hello! I am a function";
    }
}
