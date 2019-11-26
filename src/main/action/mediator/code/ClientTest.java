package main.action.mediator.code;

public class ClientTest {

	public static void main(String[] args) {
		//创建中介者
		Mediator mediator = new ConcreteMediator();
		
		//创建闹钟，加入mediator的集合中
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//创建xxx，加入mediator的集合中
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		
		//调用
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
