package headfirst.decorator;

/**
 * 综合咖啡
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
