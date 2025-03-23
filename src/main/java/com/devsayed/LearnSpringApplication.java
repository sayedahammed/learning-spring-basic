package com.devsayed;

import com.devsayed.config.BeanConfig;
import com.devsayed.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//Comment ImportResource as we are using Java based setter injection
//@ImportResource({"classpath:beans.xml"})
@Import({BeanConfig.class})
public class LearnSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		Coder coder = (Coder) context.getBean("coderBean");
		System.out.println("First Coder, Name: " + coder.getName() + ", Computer Brand: " + coder.getComputer().getBrand());

		Coder coder2 = (Coder) context.getBean("coderBean2");
		System.out.println("Second Coder, Name: " + coder2.getName() + ", Computer Brand: " + coder2.getComputer().getBrand());
	}

}
