package com.kalyan.jenkinsdemoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JenkinsTestController {

	
	@GetMapping("/test/{name}")
	@ResponseBody
	public  String  introduce(@PathVariable String name)
	{
		return  "Welcome "+ name +" in your classes..." ;
	}
}
