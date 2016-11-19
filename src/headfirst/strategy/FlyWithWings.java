package headfirst.strategy;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		//实现鸭子飞行
		System.out.println("I'm flying!!");
	}

}
