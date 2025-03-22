package com.devsayed.model;

import jakarta.annotation.PreDestroy;

public class Computer {
	private String brand;
	
	public Computer() {
		super();
		System.out.println("No - Args Constructor Computer Class");
	}
	
	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("Args Constructor Computer Class");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Computer class destroyed.");
	}
}
