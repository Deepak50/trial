package com.prj.trial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {
	@GetMapping("/hellotwo")
	public String hello() {
		return "Hello there";
	}
}
