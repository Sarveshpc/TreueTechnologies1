package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

	public class MoviesRecommender {
	    private List<Movies> movies;
	    private List<User> users;

	    public MoviesRecommender() {
	        movies = new ArrayList<Movies>();
	        users = new ArrayList<User>();
	    }

	    public void addUser(User user) {
	        users.add(user);
	    }

	    public void addMovies(Movies movie) {
	        movies.add(movie);
	    }

	    public List<Movies> recommendMovies(User user) {
	        // Simple collaborative filtering: Recommend movies rated highly by similar users
	        List<Movies> recommendations = new ArrayList<Movies>();

	        for (User otherUser : users) {
	            if (otherUser != user) {
	                Map<Integer, Integer> otherRatings = otherUser.getRatings();
	                for (int moviesId : otherRatings.keySet()) {
	                    if (!user.getRatings().containsKey(moviesId)) {
	                        recommendations.add(movies.get(moviesId - 1)); // Movie IDs are 1-based
	                    }
	                }
	            }
	      //concept of Lambda Expression and  Annmous class concept :
	            
	        // Sort recommendations by popularity or user ratings, and return the top N
	        recommendations.sort(Comparator.comparingInt((Movies movie) -> user.getRatings().getOrDefault(movie.getId(), 0))
	                .reversed());
	        
	       
	    }
			return recommendations;
	}
	
}

	    

	