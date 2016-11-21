package headfirst.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals("Clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else {
			return null;
		}
	}

}
