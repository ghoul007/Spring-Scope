## Scope Annotation
Spring basically creates and manages all beans as a singleton.
   - By default, all beans are singleton unless explicitly scoped


A singleton bean is created once in a Spring IoC container.
```JAVA
@Component
@Scope("prototype")
public class Prototype {
    public Prototype(){
        System.out.println("constructor of Prototype");
    }
}

```

The prototype bean creates and returns a new instance in every reques
```JAVA
@Component
@Scope("singleton")
public class Singleton {
    public Singleton() {
        System.out.println("constructor of Singleton");
    }
}

```