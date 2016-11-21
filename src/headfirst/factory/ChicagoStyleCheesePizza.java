package headfirst.factory;
/**
 * 芝加哥披萨
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
}
