package iteartor.iterator;

import iteartor.entity.Apple;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName AppleList
 * @Description TODO
 * @Author gclikejuice
 **/
public class AppleList implements Iterator<Apple> {
    public List<Apple> apples;
    public int index = 0;

    public AppleList(List<Apple> apples){
        this.apples = apples;
    }

    public boolean hasNext() {
        if(index >= apples.size() || apples.get(index) == null){
            return false;
        }
        return true;
    }

    public Apple next() {
        return apples.get(index++);
    }

    public void remove() {
        apples.remove(index);
    }
}
