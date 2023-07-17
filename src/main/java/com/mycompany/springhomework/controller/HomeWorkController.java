package com.mycompany.springhomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.springhomework.controller.HomeWorkController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeWorkController {
	//http://localhost:8080/springwebapp
	@RequestMapping("/")
	public String index() {
		log.info("실행1");
		log.info("실행2");
		log.info("실행3");
		return "index";
	}
}