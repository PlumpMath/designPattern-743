package designPattern.command.example3;

public class CoolCook implements CookApi {

	@Override
	public void cook(String name) {
		System.out.println("Cool Cook" +name);
	}

}
