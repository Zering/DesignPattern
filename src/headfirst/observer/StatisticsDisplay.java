package headfirst.observer;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 统计布告板
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class StatisticsDisplay implements Observer,DisplayElement{

	private SortedSet<Float> temps;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		temps = new TreeSet<Float>();
		weatherData.registerObserver(this);
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
	public void update(float temperature, float humidity, float pressure) {
		temps.add(temperature);
		display();
	}

}
