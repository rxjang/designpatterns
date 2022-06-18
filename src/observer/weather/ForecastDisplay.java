package observer.weather;

public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
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
}
