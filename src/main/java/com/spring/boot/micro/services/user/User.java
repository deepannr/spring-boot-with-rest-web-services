package com.spring.boot.micro.services.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Here in the request name should be at least 3 characters, age to be positive, birth date to be past date. 
 * For that at createUser method in API, need to add @Valid
 * {
	"id" : 2,
	"name" : "pas",
	"age" : -33,
	"birthDate" : "1981-03-26T15:30:31.844+0000"
}
 */

@ApiModel ("All Details about User")
@Entity
class User {
	@Id
	@GeneratedValue
	private int id;

	@NotNull(message = "{validation.user.name}")
	@Size(min = 3, message = "{validation.user.name.length}")
	@ApiModelProperty(notes = "Name should not be empty")
	private String name;

	@NotNull
	@Positive(message = "{validation.user.age}")
	@ApiModelProperty(notes = "Name should have at least 3 characters")
	private int age;

	@NotNull
	@Past(message = "{validation.user.birthDate}")
	@ApiModelProperty(notes = "Birth Date should be at the past")
	private Date birthDate;
	
	public User() {
		// Do Nothing
	}

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
