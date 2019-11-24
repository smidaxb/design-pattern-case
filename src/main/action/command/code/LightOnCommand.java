package main.action.command.code;

/**
 * 开灯命令
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class LightOnCommand implements Command {
    private LightReceiver receiver;

    LightOnCommand(LightReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
