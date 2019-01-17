package strategy.duck;

import strategy.behavior.BarkBehavior;
import strategy.behavior.FlyBehavior;
import strategy.behavior.SwimBehavior;

/**
 * @ClassName duck
 * @Description 鸭子的超类
 * @Author guicheng
 **/
public abstract class Duck {
    BarkBehavior barkBehavior;
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    public Duck(){}

    public void performBark(){
        barkBehavior.bark();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performSwim(){
        swimBehavior.swim();
    }

//    public Duck addBehavior(Behavior behavior){
//        if(behavior instanceof BarkBehavior){
//            this.barkBehavior = (BarkBehavior) behavior;
//        }
//        else if(behavior instanceof FlyBehavior){
//
//        }
//        else if(behavior instanceof SwimBehavior){
//
//        }
//    }

    public abstract void display();
}
