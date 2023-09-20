package onlinevotingsystem;

import java.util.ArrayList;
import java.util.List;

public class Ballet {
	
	    private List<Candidate> candidates;

	    public void Ballot() {
	        this.candidates = new ArrayList<>();
	    }

	    public void addCandidate(Candidate candidate) {
	        candidates.add(candidate);
	    }

	    public List<Candidate> getCandidates() {
	        return candidates;
	    }
	    
	    
//		public static void add(List<Ballet> ballets) {
//			// TODO Auto-generated method stub
//			
//			System.out.println(ballets.toString());
//			
//			
//		}
}


		