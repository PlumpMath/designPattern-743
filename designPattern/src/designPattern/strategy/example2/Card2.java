package designPattern.strategy.example2;

public class Card2 implements PaymentStrategy{

	private String account ="";
	public Card2(String account) {
		this.account = account;
	}
	
	@Override
	public void pay(PaymentContext ctx) {
		System.out.println(
				ctx.getUserName() + account +" card2 pay...");
	}

}
