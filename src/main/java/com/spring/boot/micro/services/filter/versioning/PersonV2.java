package com.spring.boot.micro.services.filter.versioning;

class PersonV2 {
	private Name name;
	
	private int age;
	
	public PersonV2() {
		//Do Nothing
	}

	public PersonV2(Name name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
