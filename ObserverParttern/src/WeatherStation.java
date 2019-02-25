import observer.ui.*;
import subject.SystemWeatherData;
import subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 76, 29.2f);
        weatherData.setMeasurements(78, 90, 28.4f);

        //SystemWeatherData systemWeatherData = new SystemWeatherData();
        //new SystemCurrentConditionDisplay(systemWeatherData);
        //systemWeatherData.setMeasurements(80, 65, 30.4f);
    }
}
