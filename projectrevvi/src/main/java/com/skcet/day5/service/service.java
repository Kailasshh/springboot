package com.skcet.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day5.model.bookmodel;

import com.skcet.day5.repositoy.repository;

@Service

public class service {
	@Autowired
	public repository hp;
	public Object deletehotelinfo;

	//post the data
	public bookmodel saveDetails(bookmodel hm) {
		return hp.save(hm);
	
	}
	//get Data
	public List<bookmodel>getDetails(){
		return hp.findAll();
	}
	//update the data
	public bookmodel updateDetails(bookmodel hc) {
		return hp.saveAndFlush(hc);
	}
	//delete the data
	public boolean deleteDetails(int id) {
		if(hp.existsById(id)) {
		   hp.deleteById(id);
		   return true;
	}
		   return false;
	}
	public Optional<bookmodel> getBookId(int Id){
		  Optional <bookmodel> book=hp.findById(Id);
		  if(book.isPresent()) {
			  return book;
		  }
		  return null;  
	  }

	
	

}