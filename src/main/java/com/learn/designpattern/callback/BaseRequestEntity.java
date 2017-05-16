package com.learn.designpattern.callback;

public class BaseRequestEntity {

	private Integer id;

	public BaseRequestEntity() {
		super();
	}

	public BaseRequestEntity(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
