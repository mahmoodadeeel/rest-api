package com.mahmoodadeel.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}
	
	/*
	private String firstName;
	private String secondName;
	
	public PersonV2(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	@Override
	public String toString() {
		return "PersonV2 [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
	*/
}
