package designPattern.command.example3;

public class Client {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		Command chop = new ChopCommand();
		Command duck = new DuckCommand();
		Command pork = new PorkCommand();
		
		waiter.orderDish(chop);
		waiter.orderDish(duck);
		waiter.orderDish(pork);
		
		waiter.orderOver();
	}

}
