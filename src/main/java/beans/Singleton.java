package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Singleton {
    public Singleton() {
        System.out.println("constructor of Singleton");
    }
}
