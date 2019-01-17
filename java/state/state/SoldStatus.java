package state.state;

import state.entity.Machine;

/**
 * @ClassName SoldStatus
 * @Description TODO
 * @Author gclikejuice
 **/
public class SoldStatus implements State {

    private Machine machine;

    public SoldStatus(Machine machine){
        this.machine = machine;
    }


    /**
     * 机器处于奖品售出状态时，提示 已投币，正在出奖品，无需再次投币
     */
    public void injectCoin() {
        System.out.println("已投币，正在出奖品，无需再次投币");
    }

    /**
     * 机器处于奖品售出状态时，提示，正在为你出奖品，无法退币。
     */
    public void ejectCoin() {
        System.out.println("正在为你出奖品，无法退币");
    }

    /**
     * 机器处于奖品售出状态，提示 您已经得到了一个奖品
     */
    public void turnCrank() {
        System.out.println("您已经得到了一个奖品");
    }

    /**
     * 机器处于奖品售出状态，提示奖品已发放 将状态改为未投币状态
     */
    public void dispense() {
        System.out.println("奖品已发放");
        machine.setState(new NoMoneyStatus(machine));
    }
}
