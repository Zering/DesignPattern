package headfirst.decorator;

/**
 * 牛奶
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class Milk extends CondimentDecorator {

	Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
