package headfirst.command;

public enum FanSpeed {

	HIGH(3,"高速"),
	MEDIUM(2,"中速"),
	LOW(1,"低速"),
	OFF(0,"关闭");
	
	private int state;
	private String stateInfo;
	private FanSpeed(int state,String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
}
