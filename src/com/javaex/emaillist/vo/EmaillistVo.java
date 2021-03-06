package com.javaex.emaillist.vo;

public class EmaillistVo {
	
	private int no;
	private String lastName ;
	private String firstName ;
	private String adress;
	private String email;

	
	//게터 세터 
	
	
	public EmaillistVo() {}
	
	public EmaillistVo(int no, String lastName, String firstName, String adress, String email) {
		super();
		this.no = no;
		this.lastName = lastName;
		this.firstName = firstName;
		this.adress = adress;
		this.email = email;
	}
	public EmaillistVo(String lastName, String firstName, String email) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public EmaillistVo(String lastName, String firstName, String adress, String email) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.adress = adress;
		this.email = email;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmaillistVo [no=" + no + ", lastName=" + lastName + ", firstName=" + firstName + ", adress=" + adress
				+ ", email=" + email + "]";
	}


}
