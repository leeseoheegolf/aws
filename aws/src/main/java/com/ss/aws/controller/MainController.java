package com.ss.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MainController {

	// 고정ip : 43.200.23.253
	
	
	@GetMapping("/aws/v1")
	public String main(
			@RequestParam(defaultValue = "1") Integer number) {
		if(number == 1) {
			log.info("/aws/v1 호출이 됩니다! info로그#############");
		}else if(number == -1) {
			log.error("/aws/v1 호출이 됩니다! error로그#############");
		}else if(number == 0) {
			log.warn("/aws/v1 호출이 됩니다! warn로그#############");
		}
		return "<h1> aws v1</h1>"; 		
	}	
}
