package com.andrascsanyi.tools;

import java.util.Map;

public class QueryBuilder {

    public static class builder {

        private boolean isGetDogQueryEnabled;
        private boolean isGetDogsQueryEnabled;

        public builder getDogQuery(GetDogQueryInputs queryParameterAndTypeBuilder, DogTypeBuilder dogTypeBuilder) {
            isGetDogQueryEnabled = true;
            return this;
        }

        public builder getDogsQuery(boolean flag) {
            isGetDogsQueryEnabled = flag;
            return this;
        }
        
        public QueryBuilder build() {
            return null;
        }
    }

}
