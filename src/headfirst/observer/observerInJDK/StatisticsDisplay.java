package headfirst.observer.observerInJDK;

import java.util.Observable;
import java.util.Observer;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 统计布告板
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class StatisticsDisplay implements Observer,DisplayElement{

	private SortedSet<Float> temps;
	private Observable observable;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		temps = new TreeSet<Float>();
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		float min = temps.first();
		float max = temps.last();
		float sum = 0.0f;
		for (Float float1 : temps) {
			sum += float1;
		}
		float avg = sum/temps.size();
		System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			temps.add(weatherData.getTemperature());
			display();
		}
	}

}
