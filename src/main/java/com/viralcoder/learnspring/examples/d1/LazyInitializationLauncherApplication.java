package com.viralcoder.learnspring.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    // constructor injection
    ClassA classA;
    ClassB(ClassA classA){
        System.out.println("Some initialization logic");
        this.classA = classA;
    }
    void doSomething(){
        System.out.println("Do Something");
    }
}

@Configuration // using this we define spring beans
@ComponentScan //to tell in which package component is present
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        //since LazyInitializationLauncherApplication itself is configuration file where beans are defined, so passing same in context param
        try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Initialization of context");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
