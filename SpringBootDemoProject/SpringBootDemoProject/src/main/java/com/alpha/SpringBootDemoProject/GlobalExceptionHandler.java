package com.alpha.SpringBootDemoProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(DoctorNotFound.class)
	public ResponseEntity<ResponseStructure<String>> doctorNotfound(){
		System.out.println("Doc Not Found");
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatuscode(HttpStatus.NOT_FOUND.value());
		rs.setMessage("Doctor Not Found");
		rs.setData("Doc not found");
		return new ResponseEntity<ResponseStructure<String>>(HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseStructure<Map<String, String>>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		List<FieldError> ferror = ex.getFieldErrors();
		
		Map<String, String> validationmap = new HashMap<String, String>();
		
		for (FieldError fieldError : ferror) {
			validationmap.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ResponseStructure<Map<String, String>> responseStructure = new ResponseStructure<Map<String,String>>();
		responseStructure.setStatuscode(HttpStatus.NOT_ACCEPTABLE.value());
		responseStructure.setMessage("Validation Problem");
		responseStructure.setData(validationmap);
		
		return new ResponseEntity<ResponseStructure<Map<String, String>>>(responseStructure,HttpStatus.NOT_ACCEPTABLE);
	}
	
}
