package com.viralcoder.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// eliminate verbosity in creating Java Beans
// public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// released in JDK 16
record Person(String name, int age) { }
record Address(String firstLine, String city) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Mukul";
    }

    @Bean
    public String age(){
        return "15";
    }

    @Bean
    public Person person(){
        var person = new Person("Raghav", 20);
        return person;
    }

    @Bean(name = "customAddress")
    public Address address(){
        var person = new Address("KnowledgeGate", "Mumbai");
        return person;
    }
}
