package designPattern.command.example4;

public class HotCook implements CookApi, Runnable {

	private String name;

	public HotCook(String name) {
		this.name = name;
	}

	@Override
	public void cook(int tableNum, String name) {
		int cookTime = (int) (20 * Math.random());

		System.out.println(this.name + " is cooking ..." + name
				+ " for tableNum :" + tableNum);

		try {
			Thread.sleep(cookTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(this.name + "is complete!!" + name + " for tableNum"
				+ tableNum + " spend:" + cookTime + "second");
	}

	@Override
	public void run() {
		while (true) {
			Command cmd = CommandQuene.getOneCommand();

			if (cmd != null) {
				cmd.setCookApi(this);

				cmd.execute();
			}

			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
