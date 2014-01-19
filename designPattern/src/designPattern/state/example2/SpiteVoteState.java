package designPattern.state.example2;

public class SpiteVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		
		String s = voteManager.getMapVote().get(user);
		
		if(s!=null) {
			voteManager.getMapVote().remove(user);
		}
		
		System.out.println("remove user !!");
		
		if(voteManager.getMapVoteCount().get(user) >7) {
			voteManager.getMapState().put(user, new BlackVoteState());
		}
	}

}
