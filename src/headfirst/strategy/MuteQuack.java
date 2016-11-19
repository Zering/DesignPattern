package headfirst.strategy;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// 什么也不做，不能叫
		System.out.println("<Silence>");
	}

}
