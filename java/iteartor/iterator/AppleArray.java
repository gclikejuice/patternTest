package iteartor.iterator;

import iteartor.entity.Apple;

import java.util.Iterator;

/**
 * @ClassName AppleArray
 * @Description TODO
 * @Author gclikejuice
 **/
public class AppleArray implements Iterator<Apple> {
    private Apple[] apples;
    private int index = 0;

    public AppleArray(Apple[] apples){
        this.apples = apples;
    }

    public boolean hasNext() {
        if(index >= apples.length || apples[index] == null){
            return false;
        }
        return true;
    }

    public Apple next() {
        return apples[index++];
    }

    public void remove() {
        apples[index] = null;
    }
}
