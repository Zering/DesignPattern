package headfirst.adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurky turky = new WildTurky();
		//伪装成鸭子的火鸡，系统会将它当做鸭子，但实际功能却是由火鸡完成的
		Duck turkyAdapter = new TurkyAdapter(turky);
		
		System.out.println("The turky says...");
		turky.gobble();
		turky.fly();
		
		System.out.println("\nThe duck says...");
		testDuck(duck);
		
		System.out.println("\nThe turkyAdapter says...");
		testDuck(turkyAdapter);
		
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
