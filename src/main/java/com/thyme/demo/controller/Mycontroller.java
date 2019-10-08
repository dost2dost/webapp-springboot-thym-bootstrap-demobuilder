package com.thyme.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Mycontroller {

	@GetMapping(value="/test")
	public ModelAndView test() {
		return new ModelAndView("Testforthym").addObject("name", "dost");
	}
}
