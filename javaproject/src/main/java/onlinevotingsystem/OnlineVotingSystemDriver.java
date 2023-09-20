package onlinevotingsystem;

import java.util.Arrays;
import java.util.List;

public class OnlineVotingSystemDriver {


		 public static void main(String[] args) {
		        OnlineVotingSystem votingSystem = new OnlineVotingSystem();

		        // User registration and authentication
		        votingSystem.registerUser("user1", "password1");
		        boolean isAuthenticated = votingSystem.authenticateUser("user1", "password1");
		        System.out.println("Authentication: " + isAuthenticated);

		        // Ballot creation
		        List<String> candidates = Arrays.asList("Candidate A", "Candidate B", "Candidate C");
		        votingSystem.createBallet(candidates);

		        // Voting
		        boolean voteCast = votingSystem.castVote("user1", 0, 0);
		        System.out.println("Vote cast: " + voteCast);

		        // Display results
		        votingSystem.displayResults(0);
		    }
		
}
		