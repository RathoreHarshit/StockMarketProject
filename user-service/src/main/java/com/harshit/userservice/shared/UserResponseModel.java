package com.harshit.userservice.shared;

public class UserResponseModel {

    private String userName;
    private String userType;
    private String email;
    private String phone;
    private boolean confirmed;
	public UserResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponseModel(String userName, String userType, String email, String phone, boolean confirmed) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.email = email;
		this.phone = phone;
		this.confirmed = confirmed;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
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
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
    
    
}
