package headfirst.observer;

/**
 * 测试
 * @author Zhanghj @ 2016年11月19日
 *
 */
public class WeatherStation {

	public static void main(String[] args) throws InterruptedException {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		Thread.sleep(1000);
		weatherData.setMeasurements(82, 70, 29.2f);
		Thread.sleep(1000);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
