package designPattern.strategy.example2;

public class RMBCash implements PaymentStrategy{

	@Override
	public void pay(PaymentContext ctx) {
		System.out.println("RMB Cash..");
	}

}
