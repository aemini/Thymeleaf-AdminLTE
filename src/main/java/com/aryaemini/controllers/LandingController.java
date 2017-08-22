package com.aryaemini.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class LandingController {

	@RequestMapping(value="", name="index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}

}
