package com.viralcoder.learnspring.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component // beans or objects will automatically be created
class YourBusinessClass{

    //autowiring dependency1 & dependency2
//    @Autowired - field dependency injection
    Dependency1 dependency1;
//    @Autowired
    Dependency2 dependency2;

//    @Autowired
    //setter-based dependency injection
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Calling dependency 1");
        this.dependency1 = dependency1;
    }

//    @Autowired
    //setter-based dependency injection
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Calling dependency 2");
        this.dependency2 = dependency2;
    }

    //constructor based dependency injection
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Calling Constructor");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}
@Configuration
@ComponentScan // no need to write package name if searching in same package
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
