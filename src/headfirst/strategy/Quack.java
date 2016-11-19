package headfirst.strategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		// 实现鸭子呱呱叫
		System.out.println("Quack");
	}

}
