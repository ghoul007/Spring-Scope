package main;

import beans.Prototype;
import beans.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example2Scope {

    private final Singleton singleton;
    private final Prototype prototype;

    @Autowired
    public Example2Scope(Singleton singleton, Prototype prototype){
        System.out.println("creating2 ...");
        this.singleton = singleton;
        this.prototype = prototype;
    }
}
