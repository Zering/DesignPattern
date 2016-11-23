package headfirst.command;

/**
 * 一个指令实现多个动作
 * @author Zhanghj @ 2016年11月23日
 *
 */
public class MacroCommand implements Command {
	
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void excute() {
		for (Command command : commands) {
			command.excute();
		}
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
		}
	}

}
