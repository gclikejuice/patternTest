package strategy.duck;

import strategy.behavior.BarkBehavior;
import strategy.behavior.FlyBehavior;

/**
 * @ClassName FlyAndBarkDuck
 * @Description 001号鸭子只能飞行，叫，不能划水
 * @Author gclikejuice
 **/
public class FlyAndBarkDuck extends Duck {

    public FlyAndBarkDuck(){}

    public FlyAndBarkDuck(FlyBehavior flyBehavior, BarkBehavior barkBehavior){
        super.flyBehavior = flyBehavior;
        super.barkBehavior = barkBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是能飞，叫，但是不能划水的鸭子！！！");
        super.performFly();
        super.performBark();
    }

}
