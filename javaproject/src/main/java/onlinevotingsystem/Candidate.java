package onlinevotingsystem;

public class Candidate {
	
	    private String name;
	    private int voteCount;

	    public Candidate(String name) {
	        this.name = name;
	        this.voteCount = 0;
	    }

	    public void incrementVoteCount() {
	        voteCount++;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getVoteCount() {
			return voteCount;
		}

		public void setVoteCount(int voteCount) {
			this.voteCount = voteCount;
		}

	    // Getters
	    
	    
	

}
