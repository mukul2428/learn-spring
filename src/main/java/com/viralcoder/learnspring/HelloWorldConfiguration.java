package com.viralcoder.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// eliminate verbosity in creating Java Beans
// public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// released in JDK 16
record Person(String name, int age, Address address) { }
record Address(String firstLine, String city) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Mukul";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    // return type is String
    public String person(){
        var person = new Person("Raghav", 20, new Address("HelO", "BSR"));
        return person.name();
    }

    @Bean(name = "customAddress")
    // return type is Address
    public Address address(){
        var person = new Address("KnowledgeGate", "Mumbai");
        return person;
    }

    @Bean
    @Primary // made this primary to get called every time in Address.class
    public Address address2(){
        var person = new Address("Botanical", "Mumbai");
        return person;
    }

    //reuse existing beans
    @Bean
    public Person reusePerson1(){
        var person = new Person(name(), age(), new Address("HelOReuse", "BSR"));
        return person;
    }
    // or
    @Bean
    public Person reusePerson2(){
        var person = new Person(name(), age(), address());
        return person;
    }
    //or
    @Bean
    public Person reusePerson3(String name, int age, Address customAddress){
        var person = new Person(name, age, customAddress);
        return person;
    }

    @Bean
    public Person reusePerson4(String name, int age, Address address){ // here by default primary one will be called
        var person = new Person(name, age, address);
        return person;
    }
}
