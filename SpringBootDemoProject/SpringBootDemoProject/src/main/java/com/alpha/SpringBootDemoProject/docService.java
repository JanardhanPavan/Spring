package com.alpha.SpringBootDemoProject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class docService {
	
	@Autowired
	private DocRepo docrepo;

	public void saveDoctor(int id, String name, int age) {
		Doctor d = new Doctor(id,name,age);
		docrepo.save(d);
		System.out.println("Doctor saved");
	}

	public Doctor getDocById(int id) {
		Optional<Doctor> docopt = docrepo.findById(id);
		if(docopt.isPresent()) {
			return docopt.get();
		}
		return null;
	}

	public void deleteDoc(int id) {
		Doctor d = getDocById(id);
		if(d != null) {
			docrepo.delete(d);
		}
	}
	
	public ResponseEntity<ResponseStructure<Doctor>> findDocById(int id){
		Optional<Doctor> docopt = docrepo.findById(id);
		ResponseStructure<Doctor> rs = new ResponseStructure<Doctor>();
		if(docopt.isPresent()) {
			rs.setStatuscode(HttpStatus.FOUND.value());
			rs.setMessage("Doc with id : "+ id + "Found");
			rs.setData(docopt.get());
			return new ResponseEntity<ResponseStructure<Doctor>>(rs, HttpStatus.OK);
		}
		rs.setStatuscode(HttpStatus.NOT_FOUND.value());
		rs.setMessage("Doc with id : "+ id + "not-Found");
		rs.setData(null);
		return new ResponseEntity<ResponseStructure<Doctor>>(rs, HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<ResponseStructure<Doctor>> findDoctorById(int id){
		Optional<Doctor> docopt = docrepo.findById(id);
		if(!docopt.isPresent()) {
			throw new DoctorNotFound();
		}
		ResponseStructure<Doctor> rs = new ResponseStructure<Doctor>();
		rs.setStatuscode(HttpStatus.FOUND.value());
		rs.setMessage("Doc with id : "+id+" Found");
		rs.setData(docopt.get());
		return new ResponseEntity<ResponseStructure<Doctor>>(rs, HttpStatus.OK);
	}

	public void saveDoctorWithId(Doctor d) {
		
		
	}
	
}
