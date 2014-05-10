package designPattern.command.example4;

public class CookManager {
	private static boolean runFlag = false;
	
	public static void runCookManager() {
		if(!runFlag) {
			runFlag = true;
			
			HotCook cook1 = new HotCook("Jack");
			HotCook cook2 = new HotCook("Tom");
			HotCook cook3 = new HotCook("Alice");
			
			
			Thread t1 = new Thread(cook1);
			t1.start();
			Thread t2 = new Thread(cook2);
			t2.start();
			Thread t3 = new Thread(cook3);
			t3.start();
		}
	}
}
