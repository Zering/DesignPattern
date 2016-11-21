package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Veggie");
	}
}
