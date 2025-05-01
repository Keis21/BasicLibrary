package com.main;

import java.time.LocalDate;

public class RentInfo {

	private Customer customer;
	private Book book;
	private LocalDate dueDate;
	private LocalDate firstDate;
	private boolean startRent;

	public RentInfo(Customer customer, Book book, LocalDate date) {
		this.customer = customer;
		this.book = book;
		this.dueDate = date;
	}

	public LocalDate getDate() {
		return this.dueDate;
	}

	public Book getBook() {
		return this.book;
	}
	
	public void setStartRent(boolean a) {
		startRent = a;
	}

	@Override
	public String toString() {
		LocalDate today = LocalDate.now();
		if(startRent) {
			firstDate =today;
			return "Rent started, details:\n"+"Customer: " + customer.getFullName() +
					" \nBook: " + book.toString()+"\nRent started on Date: "+ firstDate +
					" \nRent ends on Date: " + dueDate + "\n";
		} else {
			return "Rent ended, details:\n"+"Customer: " + customer.getFullName() +
					" \nBook: " + book.toString()+"\nRent started on Date: "+ firstDate+
					" \nRent ended on Date: " + dueDate + "\n";
		}
	}

}
