package designPattern.state.workFlow;

public class Client {

	public static void main(String[] args){
		LeaveRequestModel lrm = new LeaveRequestModel();
		
		lrm.setUser("user1");
		lrm.setBeginDate("01-01");
		lrm.setLeaveDays(1);
		
		LeaveRequestContext request = new LeaveRequestContext();
		request.setBusinessVO(lrm);
		request.setState(new ProjectManagerState());
		
		request.doWork();
	}
}
