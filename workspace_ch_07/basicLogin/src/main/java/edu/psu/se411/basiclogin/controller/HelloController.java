package edu.psu.se411.basiclogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

	@GetMapping("/greet")
	public String greet(HttpServletRequest request) {
		return ("Selem: " + request.getSession().getId());
	}

}
