package com.viralcoder.learnspring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. launch a spring context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            //2. Configure the things that we want spring to manage - @Configuration
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            //3. Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("customAddress"));
            //or
            System.out.println(context.getBean(Address.class));
            //reuse existing beans
            System.out.println(context.getBean("reusePerson1"));
            System.out.println(context.getBean("reusePerson2"));
            System.out.println(context.getBean("reusePerson3"));
            System.out.println(context.getBean("reusePerson4"));
        }
    }
}
