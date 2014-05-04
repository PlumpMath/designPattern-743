package designPattern.strategy.example;

public class OldlCustomerStrategy implements Strategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("old");
		return goodsPrice*0.95;
	}

}
