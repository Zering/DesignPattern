package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "NY Style Sauce and Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Pepperoni");
	}
}
