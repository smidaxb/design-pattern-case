package main.action.state.code;

/**
 * 奖品发放状态
 * @author Administrator
 *
 */
public class DispenseState extends State {
    //初始化时传入活动引用，领奖完毕改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }


    @Override
    public void deductMoney() {
        System.out.println("当前处于奖品发放状态，不可扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("已中奖，请领奖");
        return false;
    }

    //领奖
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("领取奖品");
            //转为不可抽奖状态
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
//            activity.setState(activity.getDispensOutState());
            System.out.println("抽奖活动结束");
            System.exit(0);
        }

    }
}
