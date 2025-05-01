package com.main;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		 Library lib = new Library("City Library");
		 System.out.println(lib.getName()+"\n");

	        // Create books
	        Book b1 = new Book("The Time Machine", "H.G. Wells", "Penguin", "Sci-Fiction", 180, 1895);
	        Book b2 = new Book("Romeo and Juliet", "Shakespeare", "Oxford", "Romance", 120, 1597);

	        // Get section and add books
	        Section sciFi = lib.getSection("Sci-Fiction");
	        Section romance = lib.getSection("Romance");

	        sciFi.addBook(b1);
	        romance.addBook(b2);

	        // Create customers
	        Customer c1 = new Customer("Alice", "Smith", LocalDate.of(2000, 3, 15));
	        Customer c2 = new Customer("Bob", "Johnson", LocalDate.of(1995, 8, 22));

	        // Rent books
	        lib.rent(c1, b1, sciFi);
	        lib.rent(c2, b2, romance);

	        // Simulate checking for expired books
	        lib.check();
	        
	        //availability check
	        if(lib.isAvailable("The Time Machine", "H.G. Wells"))
	        	System.out.println("Yes this book is available!");
	        else
	        	System.out.println("No, this book is not available.");
	}

}
