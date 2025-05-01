package com.main;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;

public class Library {

	private String name;
	private LinkedHashMap<String, Section> sections;
	private PriorityQueue<RentInfo> infoQueue;
	private final String[] categories = { "Romance", "Drama", "Mystery", "History", "Sci-Fiction" };

	public Library(String name) {
		this.name = name;
		sections = new LinkedHashMap<>();

		for (String str : categories) {
			Section sect = new Section(str);
			sections.put(sect.getName(), sect);
		}
		infoQueue = new PriorityQueue<>((r1, r2) -> r1.getDate().compareTo(r2.getDate()) // sort by closest due date
		);
	}

	public String getName() {
		return this.name;
	}

	public Section getSection(String sect) {
		return sections.get(sect);
	}

	public void rent(Customer cust, Book book, Section sect) {
		LocalDate dueTo = cust.rentBook(book, sect);
		RentInfo r = new RentInfo(cust, book, dueTo);
		book.setRent();
		infoQueue.add(r);
		r.setStartRent(true);
		System.out.println(r.toString());
	}

	public void check() {
		// If you want to check if this works, you can adjust the date below to a future
		// date,
		// but be sure to make it longer than 2 weeks in the future so the rent duration
		// ends.
		LocalDate today = LocalDate.of(2025, 5, 20);
		//LocalDate today = LocalDate.now();
		while (!infoQueue.isEmpty() && !infoQueue.peek().getDate().isAfter(today)) {
			RentInfo var = infoQueue.poll();
			Optional<Book> optionalBook = sections.get(var.getBook().getCategory()).getBook(var.getBook().getTitle(),
					var.getBook().getAuthor());
			optionalBook.ifPresent(book -> {
				book.removeRent();
				System.out.println("This book is available again: " + book.toString());
			});

			var.setStartRent(false);
			System.out.print(var.toString() + "\n");
		}
	}

	public boolean isAvailable(String title, String author) {

		for (Map.Entry<String, Section> entry : sections.entrySet()) {
			String category = entry.getKey();
			Section sect = entry.getValue();
			if (sect.checkAvailability(title, author))
				return true;
		}

		return false;
	}
}
