package strategy.behaviorImpl;

import strategy.behavior.BarkBehavior;

/**
 * @ClassName BarkBehaviorImpl01
 * @Description 呱呱叫
 * @Author gclikejuice
 **/
public class BarkBehaviorImpl01 implements BarkBehavior {
    private String bark;

    public BarkBehaviorImpl01(String bark){
        this.bark = bark;
    }

    public void bark() {
        System.out.println(bark);
    }
}
