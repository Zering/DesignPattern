package headfirst.command;

public class CeilingFan {
	String location;
	FanSpeed speed;
	public CeilingFan(String location) {
		this.location = location;
		speed = FanSpeed.OFF;
	}
	
	public void high() {
		speed = FanSpeed.HIGH;
	}
	
	public void medium() {
		speed = FanSpeed.MEDIUM;
	}
	
	public void low() {
		speed = FanSpeed.LOW;
	}
	
	public void off() {
		speed = FanSpeed.OFF;
	}
	
	public FanSpeed getSpeed() {
		return speed;
	}
}
