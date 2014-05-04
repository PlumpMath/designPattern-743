package designPattern.strategy.example;

public class Price {

	private Strategy strategy = null;
	
	public Price (Strategy strategy) {
		this.strategy = strategy;
	}
	public double quote(double goodsPrice) {
		return this.strategy.calcPrice(goodsPrice);
	}
}
