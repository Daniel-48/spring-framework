package com.dam.models;

public class User {

	private String name;
	private String surnames;
	private String email;
	private String phone;

	public User() {
	}

	public User(String name, String surnames) {
		this.name = name;
		this.surnames = surnames;
	}

	public User(String name, String surnames, String phone, String email) {
		this.name = name;
		this.surnames = surnames;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
