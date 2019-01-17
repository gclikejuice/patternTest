package state.state;

import state.entity.Machine;

/**
 * @ClassName NoMoneyStatus
 * @Description TODO
 * @Author gclikejuice
 **/
public class NoMoneyStatus implements State {

    private Machine machine;

    public NoMoneyStatus(Machine machine){
        this.machine = machine;
    }

    /**
     * 机器处于无投币状态时，提示 接收到投币请求，请稍后，将机器状态变为已投币状态
     */
    public void injectCoin() {
        System.out.println("接收到投币请求，请稍后");
        machine.setState(machine.getState_has_money());
    }

    /**
     *  机器处于无投币状态，提示 您未投币，无法退币
     */
    public void ejectCoin() {
        System.out.println("您未投币，无法退币");
    }

    /**
     * 机器处于未投币状态，提示 请先投币
     */
    public void turnCrank() {
        System.out.println("请先投币");
    }

    /**
     *  机器处于未投币状态，提示请投币
     */
    public void dispense() {
        System.out.println("请投币");
    }
}
