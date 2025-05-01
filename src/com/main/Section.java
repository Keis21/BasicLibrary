package com.main;

import java.util.ArrayList;
import java.util.Optional;

public class Section {

	private String name;
	private ArrayList<Book> shelf = new ArrayList<>();

	public Section(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addBook(Book book) {
		shelf.add(book);
	}

	public Optional<Book> getBook(String title, String author) {
			for (Book book : shelf) {
				if ((book.getTitle().equalsIgnoreCase(title))
						&& (book.getAuthor().equalsIgnoreCase(author)))
					return Optional.of(book);
			}
		return Optional.empty();
	}

	public boolean checkAvailability(String title, String author) {
		
		for (Book book : shelf) {
			if ((book.getTitle().equalsIgnoreCase(title)) && (book.getAuthor().equalsIgnoreCase(author))) {
				if (!book.isTaken()) {
					return true;
				}
			}
		}
		return false;

	}

	public void removeBook(Book book) {
		shelf.remove(book);
	}

}
