package headfirst.decorator;

/**
 * 低咖啡因
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}