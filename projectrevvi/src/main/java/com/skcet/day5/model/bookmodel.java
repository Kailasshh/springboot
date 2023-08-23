package com.skcet.day5.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class bookmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int bookid;
 @Column(name="bookname")
 private String bookname;
 @Column(name="bookauthor")
 private String bookauthor;
 private String bookmodel;
 private int bookpages;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
public String getBookmodel() {
	return bookmodel;
}
public void setBookmodel(String bookmodel) {
	this.bookmodel = bookmodel;
}
public int getBookpages() {
	return bookpages;
}
public void setBookpages(int bookpages) {
	this.bookpages = bookpages;
}
 
}
