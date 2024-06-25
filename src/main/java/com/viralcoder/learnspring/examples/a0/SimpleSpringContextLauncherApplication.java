package com.viralcoder.learnspring.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("package com.viralcoder.learnspring.game")
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
        }
    }
}
