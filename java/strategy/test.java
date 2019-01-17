package strategy;

import strategy.behavior.BarkBehavior;
import strategy.behavior.FlyBehavior;
import strategy.behavior.SwimBehavior;
import strategy.behaviorImpl.BarkBehaviorImpl01;
import strategy.behaviorImpl.FlyBehaviorImpl01;
import strategy.behaviorImpl.SwimBehaviorImpl01;
import strategy.duck.Duck;
import strategy.duck.FlyAndBarkDuck;

/**
 * @ClassName test
 * @Description TODO
 * @Author gclikejuice
 **/
public class test {
    public static void main(String[] args) {
        BarkBehavior barkBehavior = new BarkBehaviorImpl01("呱呱叫");
        FlyBehavior flyBehavior = new FlyBehaviorImpl01("横着飞");
        SwimBehavior swimBehavior = new SwimBehaviorImpl01("躺着划水");

        // duck001号可以飞，叫，但是不能划水
        Duck duck001 = new FlyAndBarkDuck(flyBehavior,barkBehavior);
        duck001.display();
    }
}
