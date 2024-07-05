package com.viralcoder.learnspring.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        this.someDependency = someDependency;
        System.out.println("All Dependencies are ready");
    }

    // want to call specific method of someDependency after dependency injection
    // so using @postcontruct - this method initialize() will be called as soon as spring autowires dependency
    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    //release resources that it has been holding
    @PreDestroy
    public void cleanup(){
        System.out.println("Clean up");
    }
}

@Component
class SomeDependency{

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration // using this we define spring beans
@ComponentScan //to tell in which package component is present
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        //since PrePostAnnotationsContextLauncherApplication itself is configuration file where beans are defined, so passing same in context param
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
