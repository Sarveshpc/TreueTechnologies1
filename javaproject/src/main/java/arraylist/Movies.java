package arraylist;
import java.util.*;

public class Movies {
	    private int id;
	    private String title;
	    private Set<String> genres;

	    public Movies(int id, String title, Set<String> genres) {
	        this.id = id;
	        this.title = title;
	        this.genres = genres;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public Set<String> getGenres() {
	        return genres;
	    }
}
	

	