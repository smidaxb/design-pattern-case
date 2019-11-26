package main.action.mediator.code;

public abstract class Mediator {
	//将具体同事对象加入集合
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收消息，由具体的同事对象发出
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
