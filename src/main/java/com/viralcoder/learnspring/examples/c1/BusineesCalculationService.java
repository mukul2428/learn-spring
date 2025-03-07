package com.viralcoder.learnspring.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
// if we are writing business logic in a class then we can use @service
@Service
public class BusineesCalculationService {
    private DataService dataService;

    //used constructor injection to inject dependency(dependency is in form of interface)
    public BusineesCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
