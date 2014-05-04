package designPattern.strategy.example2;

// extends Context
public class PaymentContext2 extends PaymentContext{

	private String account = null;
	
	public PaymentContext2(String userName, double money,String account,
			PaymentStrategy strategy) {
		super(userName, money, strategy);
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
}
