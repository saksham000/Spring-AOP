package com.spring.aop.aopexample.business;

import org.springframework.stereotype.Repository;

import com.spring.aop.aopexample.annotations.TrackTime;

@Repository
public class DataService1 {

    @TrackTime
    public int[] retriveData(){
        return new int[] {11,22,33,44,55};
    }

}
