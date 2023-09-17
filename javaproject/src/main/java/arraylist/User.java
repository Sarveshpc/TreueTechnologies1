package arraylist;

import java.util.HashMap;
import java.util.Map;

public class User {
	
	
	    private int id;
	    private Map<Integer, Integer> ratings; // Movie ID to Rating mapping

	    public User(int id) {
	        this.id = id;
	        this.ratings = new HashMap<Integer, Integer>();
	    }

	    public int getId() {
	        return id;
	    }

	    public Map<Integer, Integer> getRatings() {
	        return ratings;
	    }

	    public void rateMovie(int movieId, int rating) {
	        ratings.put(movieId, rating);
	    }
}


	