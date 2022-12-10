package com.simplilearn.foodboxproject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
 */
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
//@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);;
    }
}
