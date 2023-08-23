package com.skcet.day5.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day5.model.bookmodel;
public interface repository extends JpaRepository<bookmodel, Integer> {

}