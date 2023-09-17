package arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MoviesDriver {

		    public static void main(String[] args) {
		        MoviesRecommender recommender = new MoviesRecommender();

		        Movies movies1 = new Movies(1, "Movie A", new HashSet<>(Arrays.asList("Action", "Adventure")));
		        Movies movies2 = new Movies(2, "Movie B", new HashSet<>(Arrays.asList("Drama", "Romance")));
		        Movies movies3 = new Movies(3, "Movie C", new HashSet<>(Arrays.asList("Comedy")));
		        // Add more movies...

		        User user1 = new User(1);
		        user1.rateMovie(1, 5);
		        user1.rateMovie(2, 4);
		        // Add more ratings...

		        User user2 = new User(2);
		        user2.rateMovie(1, 4);
		        user2.rateMovie(3, 3);
		        // Add more ratings...

		        recommender.addMovies(movies1);
		        recommender.addMovies(movies2);
		        recommender.addMovies(movies3);
		        // Add more movies...

		        recommender.addUser(user1);
		        recommender.addUser(user2);
		        // Add more users...

		        User targetUser = user2;
		        List<Movies> recommendations = recommender.recommendMovies(targetUser);

		        System.out.println("Recommendations for User " + targetUser.getId() + ":");
		        for (Movies movies : recommendations) {
		            System.out.println(movies.getTitle() + " - Genres: " + String.join(", ", movies.getGenres()));
		        }
		    }
}

		