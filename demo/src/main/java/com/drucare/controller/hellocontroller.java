package com.drucare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hellocontroller {
		@RequestMapping("/hello")
		public String sayHello() {
			return "hello team ";
		}


	}

