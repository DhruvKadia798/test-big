package com.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping({"/",""})
	public String index(HttpServletRequest request) {
		return "Hellow your ip is: "+request.getRemoteAddr();
	}
	
}
