package com.alpha.SpringBootDemoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class RequestController {
	
	@Autowired
	private docService docservice;
	
	
	@GetMapping("/add")
	public void add(){
		System.out.println("This is add operation");
	}
	@GetMapping("/sub")
	public void sub() {
		System.out.println("this is submit Operation");
	}
	@GetMapping("/login/user/{username}/pass/{password}")
	public void login(@PathVariable String username, @PathVariable int password) {
		System.out.println("user: "+ username+" "+"pass: "+ password);
		System.out.println("This is login operation");
	}
	@GetMapping("/login")
	public void loginoperation(@RequestParam String user, @RequestParam int pass) {
		System.out.println(user+" -> "+pass);
		System.out.println("this is login operation");
	}
	@GetMapping("/savedata")
	public void savedata(@RequestHeader String name, @RequestHeader int age) {
		System.out.println(name+" -> "+age);
		System.out.println("this is save operation");
	}
	@GetMapping("/sendStudent")
	public Student senddata(@RequestBody Student s) {
		System.out.println(s);
		System.out.println("got Student data");
		return s;
	}
	
	@GetMapping("/savedoc")
	public void savedoc(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
		docservice.saveDoctor(id,name,age);
	}
	@GetMapping("/getDocById/{id}")
	public Doctor getDocById(@PathVariable int id) {
		return docservice.getDocById(id);
	}
	@GetMapping("/deleteDocById/{id}")
	public void deleteDocById(@PathVariable int id) {
		docService docService2 = new docService();
		docService2.deleteDoc(id);
	}
	@GetMapping("/findDocById/{id}")
	public ResponseEntity<ResponseStructure<Doctor>> findDocById(@PathVariable int id){
		return docservice.findDocById(id);
	}
	@GetMapping("/findDocByIdNew/{id}")
	public ResponseEntity<ResponseStructure<Doctor>> findDoctorById(@PathVariable int id){
		return docservice.findDocById(id);
	}
	@GetMapping("/savedoctor")
	public void savedoctor(@RequestBody @Valid Doctor d) {
		docservice.saveDoctorWithId(d);
	}
}
	