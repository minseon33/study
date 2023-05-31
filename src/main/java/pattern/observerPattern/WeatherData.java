package pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    //인스턴스 변수 선언

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }
}
