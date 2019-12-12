package com.oceanwood.platform.zuul.controller;

import com.oceanwood.platform.zuul.utils.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/home")
public class HomeController {

	@GetMapping("/loadData")
	public ResponseData loadData() {
		return ResponseData.ok("hello");
	}
	
}
