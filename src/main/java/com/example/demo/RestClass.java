package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClass {

	@RequestMapping("/getFreomMvn")
	public String methi() {
		return "HI Basha from Mvn ";
	}
}
