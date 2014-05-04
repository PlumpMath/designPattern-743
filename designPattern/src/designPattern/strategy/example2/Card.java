package designPattern.strategy.example2;

public class Card implements PaymentStrategy {

	@Override
	public void pay(PaymentContext ctx) {

		PaymentContext2 ctx2 = (PaymentContext2) ctx;
		System.out.println
		(ctx2.getAccount()+"Card pay ...");
	}

	
}
