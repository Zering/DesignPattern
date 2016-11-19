package headfirst.decorator;

/**
 * 奶泡
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class Whip extends CondimentDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
