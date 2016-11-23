package headfirst.command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		remoteControlWithUndo.setCommand(0, lightOnCommand, lightOffCommand);
		
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
		System.out.println(remoteControlWithUndo);
		
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
		System.out.println(remoteControlWithUndo);
		
		System.out.println("-------------来个电风扇-----------------");
		
		CeilingFan fan = new CeilingFan("Living room");
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(fan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(fan);
		remoteControlWithUndo.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		
		remoteControlWithUndo.onButtonWasPushed(1);
		remoteControlWithUndo.offButtonWasPushed(1);
		remoteControlWithUndo.undoButtonWasPushed();
		
		System.out.println("--------------宏命令：把多个命令集合成一个----------");
		
		Command[] onMacro = {lightOnCommand,ceilingFanHighCommand};
		Command[] offMacro = {lightOffCommand,ceilingFanOffCommand};
		MacroCommand onMacroCommand = new MacroCommand(onMacro);
		MacroCommand offMacroCommand = new MacroCommand(offMacro);
		
		remoteControlWithUndo.setCommand(2, onMacroCommand, offMacroCommand);
		remoteControlWithUndo.onButtonWasPushed(2);
		remoteControlWithUndo.offButtonWasPushed(2);
		remoteControlWithUndo.undoButtonWasPushed();
	}
}
