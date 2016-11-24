package headfirst.adapter;

public class TurkyAdapter implements Duck{
	Turky turky;
	
	public TurkyAdapter(Turky turky) {
		this.turky = turky;
	}
	@Override
	public void quack() {
		turky.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turky.fly();
		}
	}

}
