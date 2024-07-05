package com.viralcoder.learnspring.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass{

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtoTypeClass{

}

@Configuration // using this we define spring beans
@ComponentScan //to tell in which package component is present
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        //since BeanScopesLauncherApplication itself is configuration file where beans are defined, so passing same in context param
        try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
        }
    }
}
