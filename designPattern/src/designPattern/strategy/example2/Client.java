package designPattern.strategy.example2;

public class Client {

	public static void main(String[] args) {
		PaymentStrategy strategyRMB = new RMBCash();
		PaymentStrategy strategyDollar =new DollarCash();
		
		PaymentContext ctx1 = new PaymentContext("user1",200, strategyRMB);
		ctx1.payNow();
		
		PaymentContext ctx2 = new PaymentContext("user2",555,strategyDollar);
		ctx2.payNow();
		
		//add new Strategy by Strategy Context
		PaymentStrategy strategyCard = new Card(); 
		PaymentContext ctx3 = new PaymentContext2("user3", 444, "account", strategyCard);
		ctx3.payNow();
		
		//add new Strategy by strategy subclass constructor
		
		PaymentStrategy straegyCard2 = new Card2("01000022");
		PaymentContext ctx4 = new PaymentContext("suer4", 999, straegyCard2);
		ctx4.payNow();
	}
}
