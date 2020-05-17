package com.example.demo.Home.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    
	@GetMapping(value="/")
	public String index(){
		return "test REST";
	}
}