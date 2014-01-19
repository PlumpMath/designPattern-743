package designPattern.state.example2;

public class RepeatVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
			System.out.println("vote repeat!!");
			
			if(voteManager.getMapVoteCount().get(user) >=4) {
				voteManager.getMapState().put(user, new SpiteVoteState());
			}
	}

}
