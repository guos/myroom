package com.get.rent.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int cityID;
	private String cityName;
	private int provinceID;

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

}
