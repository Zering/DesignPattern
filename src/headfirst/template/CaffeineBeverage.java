package headfirst.template;
/**
 * 使用模板方法定义一个算法的步骤，并允许子类为一个或多个步骤提供实现
 * @author Zhanghj @ 2016年11月24日
 *
 */
public abstract class CaffeineBeverage {

	//不希望被覆盖，用final修饰
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	void boilWater(){
		System.out.println("Boiling Water");
	}
	
	abstract void brew();
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	abstract void addCondiments();
}
