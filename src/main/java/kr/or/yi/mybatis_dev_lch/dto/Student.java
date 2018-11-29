package kr.or.yi.mybatis_dev_lch.dto;

import java.util.Date;

public class Student {
	private String studId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studId, String name, String email, PhoneNumber phone, Date dob) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %s %s", studId, name, email, phone,
				dob);
	}
	
}
