package observer;

import observer.observer.BoardA;
import observer.observer.BoardB;
import observer.observer.BoardC;
import observer.observer.Observer;
import observer.subject.Weather;

/**
 * @ClassName test
 * @Description TODO
 * @Author gclikejuice
 **/
public class test {
    public static void main(String[] args) {
        Observer a = new BoardA();
        Observer b = new BoardB();
        Observer c = new BoardC();

        Weather weather = new Weather();
        weather.setAverageTemperate("39℃");
        weather.setCould("多云");
        weather.setDate("2019/1/16");
        weather.setRain("三级降雨");
        weather.setTemperate("35℃");
        weather.setWind("八级大狂风");
        weather.setWeather("天气良好");

        weather.registerObserver(a);
        weather.registerObserver(b);
        weather.registerObserver(c);

        weather.removeObserver(b);

        weather.notifyObservers();

        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        System.out.println(c);

    }
}
