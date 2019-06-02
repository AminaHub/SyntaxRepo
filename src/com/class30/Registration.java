package com.class30;

public class Registration {
	private String email;
	private String userName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("gmail")) {
			this.email=email;
		}else {
			System.out.println("Please provide only gmail email");
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(!(userName.isEmpty())) {
			this.userName = userName;
				if(userName.length()>6) {
					this.userName=userName;
					
				}else {
					System.out.println("Username should be more than 6 charactors");
				}
			
		}else {
			System.out.println("Username cannot be empty");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty()) {
			this.password = password;
			if(password.length()>6) {
					if(!password.contains(userName)) {
						this.password=password;
					}else {
						System.out.println("Password cannot contain username");
					}
			}else {
				System.out.println("Password should be more than 6 charactors");
			}
			
		}else {
			System.out.println("Username cannot be empty");
		}
		
	}
	

}
