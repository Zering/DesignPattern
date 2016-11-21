package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza() {
		name = "Chicago Style Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Clam");
	}
}
