package headfirst.observer;

/**
 * 观察或订阅的主题/被观察者
 * @author Zhanghj @ 2016年11月19日
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
