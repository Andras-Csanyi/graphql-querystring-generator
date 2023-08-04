package com.andrascsanyi.tools;

public class GetDogQueryInputs {
    private Integer firstParameter;
    
    private GetDogQueryInputs(Integer firstParameter) {
        this.firstParameter = firstParameter;
    }
    
    public static class builder{
        
        private Integer firstParameter;
        
        public builder setFirstParameter(Integer parameterValue) {
            firstParameter = parameterValue;
            return this;
        }
        
        public GetDogQueryInputs build() {
            return new GetDogQueryInputs(
                firstParameter
            );
        }
        
    }
}
