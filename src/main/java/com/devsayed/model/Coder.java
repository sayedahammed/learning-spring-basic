package com.devsayed.model;

import jakarta.annotation.PreDestroy;

public class Coder {
	private String name;
	private String email;
	private Computer computer;
	
	public Coder(String name, String email, Computer computer) {
		super();
		this.name = name;
		this.email = email;
		this.computer = computer;
		System.out.println("Args Constructor Coder Class");
	}

	public Coder() {
		super();
		System.out.println("No - Args Constructor Coder Class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Coder class destroyed.");
	}
	
}
