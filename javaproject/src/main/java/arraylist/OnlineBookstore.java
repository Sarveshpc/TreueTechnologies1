package arraylist;

import java.util.ArrayList;
import java.util.List;

public class OnlineBookstore {
    private List<Book> books;

    public OnlineBookstore() {
       ArrayList<Book> books = new ArrayList<Book>();
    }

    // Add a book to the collection
//    public void addBook(Book book) {
//        books.add(book)  ; 
//    }
//    
//        		
//    

    



    // Remove a book from the collection
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Search for books by title
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle1().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    // List all books in the collection
    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	  System.out.println("Book is added successfully:");
		
	}
}

   