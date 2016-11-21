package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
