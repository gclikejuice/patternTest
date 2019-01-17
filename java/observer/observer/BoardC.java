package observer.observer;

import observer.subject.Weather;

/**
 * @ClassName BoardC
 * @Description TODO
 * @Author gclikejuice
 **/
public class BoardC implements Observer<Weather> {
    private String wind;
    private String rain;
    private String could;
    private String date;

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

    public String getCould() {
        return could;
    }

    public void setCould(String could) {
        this.could = could;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void update(Weather weather) {
        this.could = weather.getCould();
        this.date = weather.getDate();
        this.rain = weather.getRain();
        this.wind = weather.getWind();
    }

    @Override
    public String toString() {
        return this.wind+" \n"+this.rain+" \n"+this.could+" \n"+this.date;
    }
}
