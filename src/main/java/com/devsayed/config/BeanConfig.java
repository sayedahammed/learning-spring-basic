package com.devsayed.config;

import com.devsayed.model.Coder;
import com.devsayed.model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Coder coderBean(@Qualifier("computerBean") Computer computer) {
        Coder coder = new Coder();
        coder.setName("Mr. John");
        coder.setEmail("john@john.me");
        coder.setComputer(computer);
        return coder;
    }

    @Bean
    public Computer computerBean() {
        Computer computer = new Computer();
        computer.setBrand("Intel");
        return computer;
    }

    @Bean
    public Coder coderBean2(@Qualifier("computerBean2") Computer computer) {
        Coder coder = new Coder();
        coder.setName("Alex");
        coder.setEmail("alex@alex.me");
        coder.setComputer(computer);
        return coder;
    }

    @Bean
    public Computer computerBean2() {
        Computer computer = new Computer();
        computer.setBrand("Gigabyte");
        return computer;
    }
}
