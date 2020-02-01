package main;

import beans.Prototype;
import beans.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleScope {

    private final Singleton singleton;
    private final Prototype prototype;

    @Autowired
    public  ExampleScope(Singleton singleton, Prototype prototype){
        System.out.println("creating ...");
        this.singleton = singleton;
        this.prototype = prototype;
    }
}
