package designPattern.strategy.example;

public class LargeCustomerStrategy implements Strategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("Large");
		return goodsPrice*0.9;
	}

}
