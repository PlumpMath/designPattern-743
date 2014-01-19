package designPattern.state.workFlow;

public class AuditOverState implements State {

	@Override
	public void doWork(StateMachine request) {

		LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

		System.out.println(lrm.getUser() + " review finish, and result "
				+ lrm.getResult() + "leave:" + lrm.getLeaveDays());
	}

}
