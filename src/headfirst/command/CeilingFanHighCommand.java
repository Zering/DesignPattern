package headfirst.command;

public class CeilingFanHighCommand implements Command {

	CeilingFan fan;
	FanSpeed preSpeed;

	public CeilingFanHighCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void excute() {
		preSpeed = fan.getSpeed();
		fan.high();
		System.out.println("太热了，把电风扇调到高速");
	}

	@Override
	public void undo() {
		switch (preSpeed) {
		case HIGH:
			fan.high();
			System.out.println("撤销到高速");
			break;
		case MEDIUM:
			fan.medium();
			System.out.println("撤销到中速");
			break;
		case LOW:
			fan.low();
			System.out.println("撤销到低速");
			break;
		case OFF:
			fan.off();
			System.out.println("撤销到关闭");
			break;
		default:
			break;
		}
	}

}
