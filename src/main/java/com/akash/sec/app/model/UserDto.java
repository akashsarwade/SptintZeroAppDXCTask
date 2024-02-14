package com.akash.sec.app.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDto {

	private long id;

	// user name should not be null or empty
	// user name should have at least 2 characters
	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String userName;

	// password should not be null or empty
	// password should have at least 8 characters
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;

	public UserDto() {

	}

	public UserDto(String username, String password) {
		super();
		this.userName = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}