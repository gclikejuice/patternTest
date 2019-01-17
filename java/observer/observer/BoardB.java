package observer.observer;

import observer.subject.Weather;

/**
 * @ClassName BoardB
 * @Description TODO
 * @Author gclikejuice
 **/
public class BoardB implements Observer<Weather> {
    private String temperate;
    private String averageTemperate;
    private String date;

    public String getTemperate() {
        return temperate;
    }

    public void setTemperate(String temperate) {
        this.temperate = temperate;
    }

    public String getAverageTemperate() {
        return averageTemperate;
    }

    public void setAverageTemperate(String averageTemperate) {
        this.averageTemperate = averageTemperate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void update(Weather weather) {
        this.averageTemperate = weather.getAverageTemperate();
        this.date = weather.getDate();
        this.temperate = weather.getTemperate();
    }

    @Override
    public String toString() {
        return this.temperate+" \n"+this.averageTemperate+" \n"+this.date;
    }
}
