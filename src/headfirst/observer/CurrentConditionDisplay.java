package headfirst.observer;

/**
 * 目前状况布告板
 * 本观察者只需要温度和湿度
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: "+ temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		display();
	}

}
