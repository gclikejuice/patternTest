package state.entity;

import state.state.*;

/**
 * @ClassName Machine
 * @Description TODO
 * @Author gclikejuice
 **/
public class Machine {

    State state_has_money;
    State state_no_money;
    State state_sold;
    State state_sold_out;
    private State state ;
    int count = 0;

    public Machine(int number){
        state_has_money = new HasMoneyStatus(this);
        state_no_money = new NoMoneyStatus(this);
        state_sold = new SoldStatus(this);
        state_sold_out = new SoldOutMachine(this);

        this.count = number;
        if(count>0){
            state = state_no_money;
        }else {
            state = state_sold_out;
        }
    }

    public State getState_has_money() {
        return state_has_money;
    }

    public void setState_has_money(State state_has_money) {
        this.state_has_money = state_has_money;
    }

    public State getState_no_money() {
        return state_no_money;
    }

    public void setState_no_money(State state_no_money) {
        this.state_no_money = state_no_money;
    }

    public State getState_sold() {
        return state_sold;
    }

    public void setState_sold(State state_sold) {
        this.state_sold = state_sold;
    }

    public State getState_sold_out() {
        return state_sold_out;
    }

    public void setState_sold_out(State state_sold_out) {
        this.state_sold_out = state_sold_out;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void injectCoin(){
        state.injectCoin();
    }

    public void ejectCoin(){
        state.ejectCoin();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
        numberReduct();
    }

    public void numberReduct(){
        count--;
        if(count<0){
            System.out.println("商品售罄！");
            state = state_sold_out;
            return;
        }
        else if(count == 0){
            System.out.println("发放了一个奖品，还剩"+count);
            state = state_sold_out;
            return ;
        }else if(count>0){
            System.out.println("发放了一个奖品，还剩"+count);
        }
    }

}
