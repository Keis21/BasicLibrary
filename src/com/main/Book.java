package com.main;

public class Book {

	private String title;
	private String author;
	private String publishHouse;
	private String category;
	private int publishYear;
	private boolean isRented;

	public Book() {

	}

	public Book(String title, String author, String publishHouse, String category, int pagesNum, int publishYear) {
		this.title = title;
		this.author = author;
		this.publishHouse = publishHouse;
		this.category = category;
		this.publishYear = publishYear;
		this.isRented = false;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public boolean isTaken() {
		return this.isRented;
	}

	public void setRent() {
		this.isRented = true;
	}

	public void removeRent() {
		this.isRented = false;
	}

	public String getCategory() {
		return this.category;
	}

	@Override
	public String toString() {
		return (this.title + ", " + this.author + ", " + this.publishYear + ", " + this.publishHouse + ", "
				+ this.category);
	}
}
