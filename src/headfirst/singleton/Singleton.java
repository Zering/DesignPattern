package headfirst.singleton;
/**
 * 双重检验加锁
 * @author Zhanghj @ 2016年11月22日
 *
 */
public class Singleton {

	//volatile确保多线程正确的处理uniqueInstance变量
	private volatile static Singleton uniqueInstance;
	private Singleton(){	}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			//可能有多个线程正好运行到此处，所以需要第二次null检验以确保只实力化一个Singleton
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					return new Singleton();
				}
			} 
		}
		return uniqueInstance;
	}
	
}
