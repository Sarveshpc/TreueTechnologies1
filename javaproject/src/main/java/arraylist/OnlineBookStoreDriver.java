package arraylist;

import java.util.ArrayList;
import java.util.List;

public class OnlineBookStoreDriver {

		 public static void main(String[] args) {
		        OnlineBookstore bookstore = new OnlineBookstore();
		        
		        // Add some books to the collection
		        bookstore.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 9.99, "bookA"));
		        bookstore.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 8.99, "bookB"));
		        bookstore.addBook(new Book("1984", "George Orwell", 10.99, "Booki"));
		        bookstore.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 7.99, "bookC"));

		        // List all books
		        System.out.println("All Books:");
		        bookstore.listAllBooks();

		        // Search for books by title
		        String searchTitle = "The Great Gatsby";
		        List<Book> searchResult = bookstore.searchByTitle(searchTitle);
		        if (!searchResult.isEmpty()) {
		            System.out.println("\nBooks with title '" + searchTitle + "':");
		            for (Book book : searchResult) {
		                System.out.println(book);
		            }
		        } else {
		            System.out.println("\nNo books found with title '" + searchTitle + "'.");
		        }

		        // Remove a book
		        Book bookToRemove = new Book("1984", "George Orwell", 10.99,"bookD");
		        bookstore.removeBook(bookToRemove);
		        System.out.println("\nAfter removing '1984', the updated book list:");
		        bookstore.listAllBooks();
		    }
}
		
		//Save to grepper
		//This code creates an OnlineBookstore class that uses an ArrayList to manage a collection of books. It allows you to add, remove, search, and list books in the collection. You can customize and expand upon this code to include additional features and data structures as needed for your online bookstore project.
		//
		//
		//
		//

	



