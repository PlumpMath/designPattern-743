package designPattern.state.example;

public class SpiteVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		
		String s = voteManager.getMapVote().get(user);
		
		if(s!=null) {
			voteManager.getMapVote().remove(user);
		}
		
		System.out.println("remove user !!");
	}

}
