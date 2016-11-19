package headfirst.decorator;

/**
 * 摩卡
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
