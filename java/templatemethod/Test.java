package templatemethod;

import templatemethod.tea.MakeTea;
import templatemethod.teaimple.MakeTea01;
import templatemethod.teaimple.MakeTea02;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gclikejuice
 **/
public class Test {
    public static void main(String[] args) {
        MakeTea tea1 = new MakeTea01();
        MakeTea tea2 = new MakeTea02();

        tea1.function();
        System.out.println();
        tea2.function();

    }
}
