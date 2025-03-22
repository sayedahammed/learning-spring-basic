package com.devsayed;

import com.devsayed.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:beans.xml"})
public class LearnSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		Coder coder = (Coder) context.getBean("coder1");
		System.out.println("Name: " + coder.getName() + ", Computer Brand: " + coder.getComputer().getBrand());
	}

}
