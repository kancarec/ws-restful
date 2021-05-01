package com.ws.restful.model;

import javax.validation.constraints.NotNull;

import com.ws.restful.validation.AgeControl;

public class Student {
	@NotNull(message = "name can not be empty")
	private String name;
	@AgeControl
	private Integer age;
	private String country;
	private String city;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", country=" + country + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
