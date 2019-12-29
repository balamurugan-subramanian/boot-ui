package com.spring.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.home.repository.HospitalRepository;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class HomeController {
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	@RequestMapping("/home")
	public String home() {
		log.trace("Entering Home");
		hospitalRepository.getHospitalData();
		return "home";
	}

}
