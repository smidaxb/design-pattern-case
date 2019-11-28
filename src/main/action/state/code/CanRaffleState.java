package main.action.state.code;

import java.util.Random;

/**
 * 可以抽奖状态
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("当前处于可抽奖状态，不能扣除积分");
    }

    //抽奖动作
    @Override
    public boolean raffle() {
        System.out.println("开始抽奖");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%的中奖率
        if(num == 0){
            // 中奖，将 context变为领奖状态
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("未抽中");
            // 未中奖，改变context为不可抽奖状态
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    // 领奖动作
    @Override
    public void dispensePrize() {
        System.out.println("当前处于可抽奖状态，不能领奖");
    }
}
