package com.viralcoder.learnspring.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;



@Configuration
public class RealWorldLauncherApplication {
    public static void main(String[] args) {
        //since RealWorldLauncherApplication itself is configuration file where beans are defined
        try(var context = new AnnotationConfigApplicationContext(RealWorldLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
