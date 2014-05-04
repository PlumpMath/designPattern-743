package designPattern.strategy.example2;

public class PaymentContext {
	private String userName=null;
	
	private double money =0.0;
	
	private PaymentStrategy strategy =null;
	
	public PaymentContext(String userName,double money,PaymentStrategy strategy) {
		this.userName= userName;
		this.money =money;
		this.strategy =strategy;
	}
	public void payNow() {
		this.strategy.pay(this);
	}
	public String getUserName() {
		return userName;
	}
	public double getMoney() {
		return money;
	}
	
}
