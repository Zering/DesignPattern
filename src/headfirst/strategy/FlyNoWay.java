package headfirst.strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		//事实上并不能飞行
		System.out.println("I can't fly");
	}

}
