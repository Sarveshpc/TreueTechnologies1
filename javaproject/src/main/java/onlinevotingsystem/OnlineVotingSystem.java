package onlinevotingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineVotingSystem<ballots> {
	
	    private Map<String, User> users;
	    private List<Ballet> ballets;

	    public OnlineVotingSystem() {
	        this.users = new HashMap<>();
	       this.ballets = new ArrayList<>();
	    }

	    public void registerUser(String username, String password) {
	        users.put(username, new User(username, password));
	    }

	    public boolean authenticateUser(String username, String password) {
	        User user = users.get(username);
	        return user != null && user.getPassword().equals(password);
	    }

	    public void createBallet(List<String> candidateNames) {
	       Ballet ballet = new Ballet();
	       
	        for (String candidateName : candidateNames) {
	            ballet.addCandidate(new Candidate(candidateName));
	        }
	        Ballet balleti = new Ballet();
			ballet.add(ballets);
	    }

	    public boolean castVote(String username, int balletIndex, int candidateIndex) {
	        if (balletIndex < 0 || balletIndex >= ballets.size()) {
	            return false;
	        }

	        Ballet ballet = ballets.get(balletIndex);
	        List<Candidate> candidates = ballet.getCandidates();

	        if (candidateIndex < 0 || candidateIndex >= candidates.size()) {
	            return false;
	        }

	        Candidate selectedCandidate = candidates.get(candidateIndex);
	        selectedCandidate.incrementVoteCount();
	        return true;
	    }

	    public void displayResults(int balletIndex) {
	        if (balletIndex < 0 || balletIndex >= ballets.size()) {
	            System.out.println("Invalid ballot index.");
	            return;
	        }

	        Ballet ballet = ballets.get(balletIndex);
	        List<Candidate> candidates = ballet.getCandidates();

	        System.out.println("Election Results:");
	        for (int i = 0; i < candidates.size(); i++) {
	            Candidate candidate = candidates.get(i);
	            System.out.println((i + 1) + ". " + candidate.getName() + ": " + candidate.getVoteCount() + " votes");
	        }
	    }
}
	    

	   