package com.spring.aop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.aopexample.business.BusinessService1;

@SpringBootApplication
public class AopApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(getClass());

	private BusinessService1 businessService1;
	
	public AopApplication(BusinessService1 businessService1){
		this.businessService1 = businessService1;
	}

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	public void run(String... args) throws Exception{
		logger.info("Value Returned is {}",businessService1.calculateMax());
		
	}

}
