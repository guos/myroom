package com.get.rent.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.rent.data.entity.Province;
import com.get.rent.service.AddressService;

@RestController
@RequestMapping("address")
public class AddressController {
	@Autowired
	AddressService addressService;

	@GetMapping("p")
	public Iterable<Province> getAllProvince() {
		return addressService.getAllProvince();

	}

}
