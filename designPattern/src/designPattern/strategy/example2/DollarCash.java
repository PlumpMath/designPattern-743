package designPattern.strategy.example2;

public class DollarCash implements PaymentStrategy{

	@Override
	public void pay(PaymentContext ctx) {
		System.out.println("Dollar Cash ...");
	}

}
