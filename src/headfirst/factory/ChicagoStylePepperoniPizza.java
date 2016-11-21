package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Deep Dish Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Pepperoni");
	}
}
