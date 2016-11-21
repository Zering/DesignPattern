package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Sauce and Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Clam");
	}
}
