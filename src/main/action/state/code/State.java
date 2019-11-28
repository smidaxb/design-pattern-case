package main.action.state.code;

/**
 * 状态接口
 * @author Administrator
 */
public abstract class State {

	
	// 积分 - 50
    public abstract void deductMoney();

    //是否中将
    public abstract boolean raffle();

    // 领奖
    public abstract  void dispensePrize();

}
