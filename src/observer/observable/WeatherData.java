package observer.observable;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers(); // n이를 호출 할 때 데이터 개게를 보내지 않는다. 여기에서는 풀 모델을 사용하고 있다는 뜻이다.
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
