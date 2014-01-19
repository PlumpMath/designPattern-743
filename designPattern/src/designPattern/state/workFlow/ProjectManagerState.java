package designPattern.state.workFlow;

import java.util.Scanner;

public class ProjectManagerState implements LeaveRequestState {

	@Override
	public void doWork(StateMachine request) {

		LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

		System.out.println("projectManager handle ..");
		System.out.println(lrm.getUser() + "apply from" + lrm.getBeginDate()
				+ "," + lrm.getLeaveDays() + "1:ok,2:no");

		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNext()) {
			int a = scanner.nextInt();
			String result = "no";

			if (a == 1) {
				result = "ok";
			}
			lrm.setResult(result);

			if (a == 1) {
				if (lrm.getLeaveDays() > 3) {
					request.setState(new DepManagerState());
					request.doWork();
				} else {
					request.setState(new AuditOverState());
					request.doWork();
				}
			} else {
				request.setState(new AuditOverState());
				request.doWork();
			}
		}
	}
}
