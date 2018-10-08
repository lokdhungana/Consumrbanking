package org.banco.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class Hellojavapeoplecontroller {

	@RequestMapping(value = "/hello-people", method = RequestMethod.GET)
	public String showHelloPeople() {
		return "hello";
	}
}