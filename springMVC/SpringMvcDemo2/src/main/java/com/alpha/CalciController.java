package com.alpha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalciController {
	@GetMapping("/add")
	public void add() {
		System.out.println("This is a Addition method from com.alpha");
	}
	
	@GetMapping("/sub")
	public void sub() {
		System.out.println("This is a Subtraction method from com.alpha");
	}
	
	@GetMapping("/mul")
	public void mul() {
		System.out.println("This is a Multiplication method from com.alpha");
	}
	
	@GetMapping("/div")
	public void div() {
		System.out.println("This is a Division method from com.alpha");
	}
}
