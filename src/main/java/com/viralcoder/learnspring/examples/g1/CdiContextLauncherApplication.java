package com.viralcoder.learnspring.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
// or
@Named
class BusinessService{
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

//    @Autowired // setter dependency injection
    // or
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

//@Component
@Named
class DataService{

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
