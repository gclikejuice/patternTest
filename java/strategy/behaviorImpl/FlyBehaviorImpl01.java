package strategy.behaviorImpl;

import strategy.behavior.FlyBehavior;

/**
 * @ClassName FlyBehaviorImpl01
 * @Description 直行180m/s
 * @Author gclikejuice
 **/
public class FlyBehaviorImpl01 implements FlyBehavior {
    private String fly;

    public FlyBehaviorImpl01(String fly){
        this.fly = fly;
    }
    public void fly() {
        System.out.println(fly);
    }
}
