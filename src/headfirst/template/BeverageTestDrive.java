package headfirst.template;

public class BeverageTestDrive {

	public static void main(String[] args) {
		Tea tea = new Tea();
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		
		System.out.println("Making tea...");
		tea.prepareRecipe();
		
		System.out.println("/nMaking coffee...");
		coffeeWithHook.prepareRecipe();
	}
}
