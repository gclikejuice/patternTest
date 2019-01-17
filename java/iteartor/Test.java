package iteartor;

import iteartor.entity.Apple;
import iteartor.iterator.AppleArray;
import iteartor.iterator.AppleList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gclikejuice
 **/
public class Test {
    public static void main(String[] args) {
        Apple a1 = new Apple("红富士");
        Apple a2 = new Apple("红富土");
        Apple a3 = new Apple("黑穷士");
        Apple[] aArray = new Apple[]{a1,a2,a3};
        List<Apple> aList = new ArrayList<Apple>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);

        Iterator<Apple> appleArray = new AppleArray(aArray);
        Iterator<Apple> appleList = new AppleList(aList);

        while (appleArray.hasNext()){
            System.out.println(appleArray.next());
        }
        System.out.println();
        while (appleList.hasNext()){
            System.out.println(appleList.next());
        }
    }
}
