package com.viralcoder.learnspring.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository // if any interaction is done with database then we can use repository instead of component
//@Primary
public class MongoDBDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
