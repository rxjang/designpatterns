package observer.observable;

import observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        String forecast = "";

        if (currentPressure > lastPressure) {
            forecast = "Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            forecast = "More of the same";
        } else if (currentPressure < lastPressure) {
            forecast = "Watch out for cooler, rainy weather";
        }
        System.out.printf("Forecast: %s%n", forecast);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
