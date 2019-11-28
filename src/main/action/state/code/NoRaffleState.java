package main.action.state.code;

/**
 * 不能领奖状态
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	//初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 可以减少积分
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("处于不能抽奖状态，不可抽奖");
        return false;
    }

    //当前状态不能领奖
    @Override
    public void dispensePrize() {
        System.out.println("处于不能抽奖状态，不可领奖");
    }
}
