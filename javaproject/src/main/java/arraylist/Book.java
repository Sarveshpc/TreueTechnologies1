package arraylist;

public class Book {
	  private  String title;
	   private String author;
	  private double price;
	     String bookes;

	    public Book(String title, String author, double price, String bookes) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.bookes = bookes;
	    }

	   
	    public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}
//
//
		public void setAuthor(String author) {
			this.author = author;
		}
//
//
		public double getPrice() {
			return price;
		}
//
//
		public void setPrice(double price) {
			this.price = price;
		}

//
		public String getBookes() {
			return bookes;
		}

////
		public void setBookes(String bookes) {
			this.bookes = bookes;
		}
//

		@Override
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + ", Price: $" + price +", bookes:"+ bookes;
	        
	        
	        
	    }


		public String getTitle1() {
			// TODO Auto-generated method stub
			return title;
		}

		
}
	    
	