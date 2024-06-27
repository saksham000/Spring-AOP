package com.spring.aop.aopexample.business;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BusinessService1 {
    
    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1){
        this.dataService1 = dataService1;
    }

    public int calculateMax(){
       int[] data =  dataService1.retriveData();
       return Arrays.stream(data).max().orElse(0);
    }


}
