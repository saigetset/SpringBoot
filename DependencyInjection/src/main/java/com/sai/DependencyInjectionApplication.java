package com.sai;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sai.Employee.Employee;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	static {
		System.out.println("DependencyInjectionApplication.class filed is loaded");
	}
	public DependencyInjectionApplication() {
		System.out.println("DependencyInjectionApplication constructor");
	}

	
	@Bean(value = "timenow")
	public LocalDateTime joiningDate() {
		System.out.println("DependencyInjectionApplication.joiningDate()");
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		Employee emp= context.getBean(Employee.class);
		System.out.println(emp);
	}

}
