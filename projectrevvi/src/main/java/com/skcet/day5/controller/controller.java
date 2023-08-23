package com.skcet.day5.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day5.model.bookmodel;
import com.skcet.day5.service.service;

@RestController

public class controller {
	@Autowired
	public service mm;
	@PostMapping("/postbook")
	public String BookModel(@RequestBody bookmodel h) {
		mm.saveDetails(h);
		return "data saved";
	}
	
	@GetMapping("/getbook")
	public List<bookmodel>getrithick(){
		return mm.getDetails();
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<?> getUserbyId(@PathVariable int Id){
		Optional<bookmodel>  book = mm.getBookId(Id);
		if(book!=null) {
			return ResponseEntity.ok(book);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID ");
	}
	@PutMapping("/updatebook")
	public bookmodel updaterithick(@RequestBody bookmodel ha) {
		return mm.updateDetails(ha);
	}
	//delete by path variable
	@DeleteMapping("/deletebook/{id}")
	public String removerithick(@PathVariable("id") int hid) {
		mm.deleteDetails(hid);
		return "Hotel with Id"+hid+"is deleted";
	}
	
	@DeleteMapping("/byrepparm")
	public String removedRequestParm(@RequestParam("id") int id) {
		mm.deleteDetails(id);
		return "Hotel with Id "+id+" is deleted";
	}
    @DeleteMapping("/deletebookif/{id}")
	public ResponseEntity<String> deletebookInfo(@PathVariable int id){
		boolean deleted = mm.deleteDetails(id);
		if(deleted) {
			return ResponseEntity.ok("Book with ID "+id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book with ID "+id+" not found");
		}
	}
    
    

}