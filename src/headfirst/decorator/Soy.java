package headfirst.decorator;

/**
 * 豆浆
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.12;
	}

}
