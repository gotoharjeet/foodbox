package com.simplilearn.foodboxproject;

import java.util.List;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.simplilearn.foodboxproject.model.Admin;
import com.simplilearn.foodboxproject.repository.AdminRepository;

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
    	ApplicationContext context=SpringApplication.run(App.class, args);;
		
		  AdminRepository adminRepository=context.getBean(AdminRepository.class);
		  Admin admins=adminRepository.findByusername("user");
		 
    }
}
