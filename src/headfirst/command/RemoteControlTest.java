package headfirst.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		//初始化一个控制器
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		//添加一个能开灯的命令
		simpleRemoteControl.setCommand(lightOnCommand);
		//执行命令
		simpleRemoteControl.buttonWasPressed();
	}
}
