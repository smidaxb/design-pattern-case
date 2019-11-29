package main.action.command.code;

/**
 * 关灯命令
 * CREATED BY smida
 * Date: 2019/11/25
 */
public class LightOffCommand implements Command {
    private LightReceiver receiver;

    LightOffCommand(LightReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
