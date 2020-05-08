package com.spring.boot.micro.services.user;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


/**
 * Here in the request name should be at least 3 characters, age to be positive, birth date to be past date. 
 * For that at createUser method in API, need to add @Valid
 * {
	"id" : 2,
	"name" : "pas",
	"age" : -33,
	"birthDate" : "1981-05-07T12:27:31.844+0000"
}
 */

class User {
	private int id;

	@NotNull
	@Size(min = 3, message = "Name should have at least 3 characters")
	private String name;

	@NotNull
	@Positive(message = "Age should be greater than 0")
	private int age;

	@NotNull
	@Past(message = "Birth Date should not be greater than current date")
	private Date birthDate;

	public User(int id, String name, int age, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", birthDate=" + birthDate + "]";
	}
}
