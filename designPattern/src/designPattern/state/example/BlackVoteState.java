package designPattern.state.example;

public class BlackVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
			
		System.out.println("Black list !!");
	}

}
