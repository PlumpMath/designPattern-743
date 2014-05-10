package designPattern.command.example4;

public class Client {

	public static void main(String[] args) {
		CookManager.runCookManager();

		for (int i = 0; i < 5; i++) {
			Waiter waiter = new Waiter();

			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);

			waiter.orderDish(chop);
			waiter.orderDish(duck);

			waiter.orderOver();

		}
	}

}
