package designPattern.state.example2;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

	private Map<String,VoteState> mapState = new HashMap<String,VoteState>();
	
	private Map<String, String> mapVote = new HashMap<String, String>();

	private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

	public Map<String, String> getMapVote() {
		return mapVote;
	}

	public void setMapVote(Map<String, String> mapVote) {
		this.mapVote = mapVote;
	}

	public Map<String, Integer> getMapVoteCount() {
		return mapVoteCount;
	}

	public void setMapVoteCount(Map<String, Integer> mapVoteCount) {
		this.mapVoteCount = mapVoteCount;
	}

	public Map<String, VoteState> getMapState() {
		return mapState;
	}

	public void setMapState(Map<String, VoteState> mapState) {
		this.mapState = mapState;
	}

	public void vote(String user, String voteItem) {
		Integer oldVoteCount = mapVoteCount.get(user);
		
		if(oldVoteCount==null) {
			oldVoteCount =0;
		}
		oldVoteCount++;
		mapVoteCount.put(user, oldVoteCount);
		
		VoteState state = mapState.get(user);
		
		if(state==null) {
			state = new NormalVoteState();
		}
		state.vote(user, voteItem, this);
	}
}
