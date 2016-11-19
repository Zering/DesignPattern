package headfirst.observer.observerInJDK;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前状况布告板
 * 本观察者只需要温度和湿度
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: "+ temperature + "F degrees and " + humidity + "% humidity");
	}


	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
