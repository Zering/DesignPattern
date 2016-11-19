package headfirst.strategy;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		// 名为呱呱叫，实际上实现的是橡皮鸭的吱吱叫
		System.out.println("Squeak");
	}

}
