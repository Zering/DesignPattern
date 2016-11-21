package headfirst.factory;
/**
 * 纽约披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Veggie");
	}
}
