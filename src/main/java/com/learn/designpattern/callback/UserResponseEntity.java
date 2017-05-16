package com.learn.designpattern.callback;

/**
 * 
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class UserResponseEntity extends BaseResponseEntity {

	private Integer userId;
	private String name;
	private String idno;
	private String address;
	private Integer age;

	public UserResponseEntity() {
		super();
	}

	public UserResponseEntity(Integer userId, String name, String idno, String address, Integer age) {
		super();
		this.userId = userId;
		this.name = name;
		this.idno = idno;
		this.address = address;
		this.age = age;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserResponseEntity [userId=");
		builder.append(userId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", idno=");
		builder.append(idno);
		builder.append(", address=");
		builder.append(address);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
