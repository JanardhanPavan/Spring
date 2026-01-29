package Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalciController {
	
	@GetMapping("/add")
	public void add() {
		System.out.println("This is a Addition method");
	}
	
	@GetMapping("/sub")
	public void sub() {
		System.out.println("This is a Subtraction method");
	}
	
	@GetMapping("/mul")
	public void mul() {
		System.out.println("This is a Multiplication method");
	}
	
	@GetMapping("/div")
	public void div() {
		System.out.println("This is a Division method");
	}
}
