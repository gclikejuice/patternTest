package templatemethod.teaimple;

import templatemethod.tea.MakeTea;

/**
 * @ClassName MakeTea01
 * @Description 制作一号茶
 * @Author gclikejuice
 **/
public class MakeTea01 extends MakeTea {
    public void putTea() {
        System.out.println("我放的是乌龙茶叶");
    }

    public void boilTea() {
        System.out.println("我这煮的是半沸的");
    }

    public void putCup() {
        System.out.println("我的杯子是乾隆时期的");
    }
}
