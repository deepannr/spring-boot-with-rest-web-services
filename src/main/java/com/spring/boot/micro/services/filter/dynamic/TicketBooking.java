package com.spring.boot.micro.services.filter.dynamic;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("bookingFilter")
public class TicketBooking {
	private String name;
	
	private int age;
	
	private boolean availConcession;
	
	private boolean jointBerth;

	public TicketBooking(String name, int age, boolean availConcession, boolean jointBerth) {
		super();
		this.name = name;
		this.age = age;
		this.availConcession = availConcession;
		this.jointBerth = jointBerth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAvailConcession() {
		return availConcession;
	}

	public void setAvailConcession(boolean availConcession) {
		this.availConcession = availConcession;
	}

	public boolean isJointBerth() {
		return jointBerth;
	}

	public void setJointBerth(boolean jointBerth) {
		this.jointBerth = jointBerth;
	}
}
