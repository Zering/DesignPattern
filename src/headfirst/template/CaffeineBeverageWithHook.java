package headfirst.template;
/**
 * 使用模板方法定义一个算法的步骤，并允许子类为一个或多个步骤提供实现
 * @author Zhanghj @ 2016年11月24日
 *
 */
public abstract class CaffeineBeverageWithHook {

	//不希望被覆盖，用final修饰
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	void boilWater(){
		System.out.println("Boiling Water");
	}
	
	abstract void brew();
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	abstract void addCondiments();
	
	//使用一个钩子方法，子类视情况决定要不要覆盖它
	boolean customerWantsCondiments(){
		return true;
	}
}
