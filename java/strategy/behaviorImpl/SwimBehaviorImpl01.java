package strategy.behaviorImpl;

import strategy.behavior.SwimBehavior;

/**
 * @ClassName SwimBehaviorImpl01
 * @Description 噗噗划水
 * @Author gclikejuice
 **/
public class SwimBehaviorImpl01 implements SwimBehavior {

    private String swim;

    public SwimBehaviorImpl01(String swim){
        this.swim = swim;
    }

    public void swim() {
        System.out.println(swim);
    }
}
