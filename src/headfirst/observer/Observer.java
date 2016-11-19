package headfirst.observer;

/**
 * 观察者
 * @author Zhanghj @ 2016年11月19日
 *
 */
public interface Observer {

	public void update(float temperature,float humidity,float pressure);
}
