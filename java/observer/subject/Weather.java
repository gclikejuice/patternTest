package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Weather
 * @Description TODO
 * @Author gclikejuice
 **/
public class Weather implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    private String temperate;
    private String weather;
    private String wind;
    private String rain;
    private String date;
    private String averageTemperate;
    private String could;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getTemperate() {
        return temperate;
    }

    public void setTemperate(String temperate) {
        this.temperate = temperate;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAverageTemperate() {
        return averageTemperate;
    }

    public void setAverageTemperate(String averageTemperate) {
        this.averageTemperate = averageTemperate;
    }

    public String getCould() {
        return could;
    }

    public void setCould(String could) {
        this.could = could;
    }

    public Weather(){}

    public Weather(List<Observer> observers){
        this.observers = observers;
    }


    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }
}
