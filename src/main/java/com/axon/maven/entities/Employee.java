package com.axon.maven.entities;


import org.joda.time.DateTime;

public class Employee {

	private Integer id;
	// 不能被修改
	private String lastName;
	private String email;
	// 从前端传入的是String类型，所以需要注意转换
	private DateTime birth;

	// 不能被修改
	private DateTime createTime;
	private Department department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DateTime getBirth() {
		return birth;
	}

	public void setBirth(DateTime birth) {
		this.birth = birth;
	}

	public DateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(DateTime createTime) {
		this.createTime = createTime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", birth=" + birth
				+ ", createTime=" + createTime + ", department=" + department + "]";
	}

}
