package com.get.rent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.rent.data.dao.CityDao;
import com.get.rent.data.dao.ProvinceDao;
import com.get.rent.data.entity.City;
import com.get.rent.data.entity.Province;

@Service
public class AddressService {

	@Autowired
	CityDao cityDao;
	@Autowired
	ProvinceDao provinceDao;

	/**
	 * 查询所有的省数据
	 * 
	 * @return
	 */
	public Iterable<Province> getAllProvince() {
		return provinceDao.findAll();
	}

	public Province getOneProvinceByID(int id) {
		return provinceDao.findOne(id);
	}

	/**
	 * 查询所有的市数据
	 * 
	 * @return
	 */
	public Iterable<City> getAllCitys() {
		return cityDao.findAll();
	}

	public City getOneCityByID(int id) {
		return cityDao.findOne(id);
	}

}
