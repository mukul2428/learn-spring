package com.viralcoder.learnspring.examples.c1;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class MongoDBDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
