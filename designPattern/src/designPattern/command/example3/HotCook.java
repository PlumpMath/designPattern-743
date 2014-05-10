package designPattern.command.example3;

public class HotCook implements CookApi {

	@Override
	public void cook(String name) {
		System.out.println("cooking ..."+name);
	}

}
