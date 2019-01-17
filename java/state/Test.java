package state;

import state.entity.Machine;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gclikejuice
 **/
public class Test {
    public static void main(String[] args) {
        Machine machine = new Machine(2);
        machine.injectCoin();
        machine.turnCrank();

        System.out.println();

        machine.injectCoin();
        machine.turnCrank();

        System.out.println();

        machine.injectCoin();
        machine.turnCrank();
    }
}
