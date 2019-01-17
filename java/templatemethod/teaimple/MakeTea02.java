package templatemethod.teaimple;

import templatemethod.tea.MakeTea;

/**
 * @ClassName MakeTea02
 * @Description TODO
 * @Author gclikejuice
 **/
public class MakeTea02 extends MakeTea {
    public void putTea() {
        System.out.println("你应该是看不见这句话的");
    }

    public void boilTea() {
        System.out.println("白开水就是要100℃");
    }

    public void putCup() {
        System.out.println("我用的是热水瓶");
    }

    @Override
    public boolean needTea(){
        return false;
    }
}
