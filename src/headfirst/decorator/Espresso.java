package headfirst.decorator;

/**
 * 浓缩
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
