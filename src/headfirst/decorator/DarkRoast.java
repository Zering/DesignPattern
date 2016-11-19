package headfirst.decorator;

/**
 * 深焙
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return .99;
	}

}