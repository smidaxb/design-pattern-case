package main.action.command.code;

/**
 * 没有任何命令，空执行，用于初始化每个按钮，当调用空命令时，对象什么都不做
 * 这其实是一种设计模式，可以省略对空的判断
 * CREATED BY smida
 * Date: 2019/11/25
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
