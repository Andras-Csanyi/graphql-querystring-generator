package com.andrascsanyi.tools;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Test {

    @org.junit.jupiter.api.Test
    public void testing() {
        
        QueryBuilder queryBuilder = new QueryBuilder.builder()
            .getDogQuery(
                new GetDogQueryInputs.builder().setFirstParameter(1).build(),
                new DogTypeBuilder())
            .build();
        
    }
}
