package designPattern.state.workFlow;

import java.util.Scanner;

public class DepManagerState implements State {

	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
		
		System.out.println("DepManager handle...");
		
		System.out.println(lrm.getUser() + "apply from" + lrm.getBeginDate()
				+ "," + lrm.getLeaveDays() + "1:ok,2:no");

		Scanner scanner = new Scanner(System.in);

		if(scanner.hasNext()) {
			int a = scanner.nextInt();
			String result ="no";
			
			if(a==1) {
				result ="ok";
			}
			lrm.setResult("dep result"+result);
			
			request.setState(new AuditOverState());
			
			request.doWork();
		}
		
		request.setState(new AuditOverState());
	}

}
