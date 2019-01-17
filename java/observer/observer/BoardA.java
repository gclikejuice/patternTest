package observer.observer;

import observer.subject.Weather;

/**
 * @ClassName BoardA
 * @Description TODO
 * @Author gclikejuice
 **/
public class BoardA implements Observer<Weather> {
    private String temperate;
    private String weather;
    private String wind;

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

    public void update(Weather weather) {
        this.temperate = weather.getTemperate();
        this.weather = weather.getWeather();
        this.wind = weather.getWind();
    }


    @Override
    public String toString() {
        return this.wind+" \n"+this.weather+" \n"+this.temperate;
    }
}
