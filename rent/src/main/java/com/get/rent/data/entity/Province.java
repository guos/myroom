package com.get.rent.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Province {

	@Id
	private int provinceID;
	//@Column(name="provinceName")
	private String provinceName;

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
