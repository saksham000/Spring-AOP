package com.spring.aop.aopexample.business;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

    public int[] retriveData(){
        return new int[] {11,22,33,44,55};
    }

}
