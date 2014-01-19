package designPattern.state.example2;

public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
			voteManager.getMapVote().put(user, voteItem);
			System.out.println("vote success!!");
			voteManager.getMapState().put(user, new RepeatVoteState());
	}

}
