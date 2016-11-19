package headfirst.decorator;

/**
 * 测试
 * 
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {

		// 先来一杯纯浓缩
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		// 再来一杯双份摩卡加奶泡的深焙
		// Beverage beverage2 = new DarkRoast();
		// beverage2 = new Mocha(beverage2);
		// beverage2 = new Mocha(beverage2);
		// beverage2 = new Whip(beverage2);
		Beverage beverage2 = new Mocha(new Mocha(new Whip(new DarkRoast())));
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		// 最后来一杯豆浆、摩卡、奶泡的综合
		Beverage beverage3 = new HouseBlend();
		// beverage3 = new Soy(beverage3);
		// beverage3 = new Mocha(beverage3);
		// beverage3 = new Whip(beverage3);
		beverage3 = new Soy(new Mocha(new Whip(beverage3)));
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
