package state.state;

import state.entity.Machine;

/**
 * @ClassName HasMoneyStatus
 * @Description TODO
 * @Author gclikejuice
 **/
public class HasMoneyStatus implements State {

    private Machine machine;

    public HasMoneyStatus(Machine machine){
        this.machine = machine;
    }

    /**
     * 机器处于投币状态时，用户再次投币
     */
    public void injectCoin() {
        System.out.println("已投币，无需再次投币，请稍后");
    }

    /**
     * 机器处于投币状态，提示 正在为你退币，将机器状态改为无投币状态
     */
    public void ejectCoin() {
        System.out.println("正在为你退币，将机器状态改为无投币状态");
        machine.setState(this);
    }

    /**
     * 机器处于投币状态，提示 正在为您准备奖品，将状态改为奖品售出状态
     */
    public void turnCrank() {
        System.out.println("正在为您准备奖品");
        machine.setState(machine.getState_sold());
    }

    /**
     * 机器处于投币状态，提示错误
     */
    public void dispense() {
        System.out.println("error!");
    }
}
