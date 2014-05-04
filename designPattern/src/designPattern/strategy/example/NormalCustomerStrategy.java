package designPattern.strategy.example;

public class NormalCustomerStrategy implements Strategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("normal");
		return goodsPrice;
	}

}
