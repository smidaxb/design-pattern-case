package main.action.command.code;

/**
 * 命令接口
 * CREATED BY smida
 * Date: 2019/11/25
 */
public interface Command {
    void execute();

    void undo();
}
