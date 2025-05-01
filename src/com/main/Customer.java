package com.main;

import java.time.LocalDate;

public class Customer {

	private String fname, lname;
	private LocalDate bday;
	private Book rentedBook;

	public Customer(String fname, String lname, LocalDate bday) {
		this.fname = fname;
		this.lname = lname;
		this.bday = bday;
	}

	// normal rent period is 2 weeks
	// a customer rents a book out of specific section
	public LocalDate rentBook(Book rentedBook, Section sect) {
		LocalDate today = LocalDate.now();
		LocalDate rentDue = today.plusWeeks(2);
		return rentDue;
	}

	public String getFullName() {
		return fname + " " + lname;
	}

}
