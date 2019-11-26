package main.action.mediator.code;

//具体同事类
public class Alarm extends Colleague {

	//构造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//创建时，将自身放入ConcreteMediator 的集合中
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		//使用中介类的getMessage
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
