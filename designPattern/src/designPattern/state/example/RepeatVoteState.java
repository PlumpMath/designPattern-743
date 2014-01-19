package designPattern.state.example;

public class RepeatVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
			System.out.println("vote repeat!!");
	}

}
