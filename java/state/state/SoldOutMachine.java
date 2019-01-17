package state.state;

import state.entity.Machine;

/**
 * @ClassName SoldOutMachine
 * @Description TODO
 * @Author gclikejuice
 **/
public class SoldOutMachine implements State{
    private Machine machine;

    public SoldOutMachine(Machine machine){
        this.machine = machine;
    }

    /**
     * 机器处于奖品售罄状态时，提示 无奖品了，请勿投币。
     */
    public void injectCoin() {
        System.out.println("无奖品了，请勿投币。");
    }

    /**
     * 机器处于奖品售罄状态时，就不可能获得投币，提示 您未投币
     */
    public void ejectCoin() {
        System.out.println("您未投币");
    }

    /**
     * 机器处于奖品售罄状态，就不可能获得投币，提示 您未投币
     */
    public void turnCrank() {
        System.out.println("您未投币");
    }

    /**
     * 机器处于奖品售罄状态，提示错误
     */
    public void dispense() {
        System.out.println("error");
    }
}
