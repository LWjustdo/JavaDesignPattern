public class WeatherStation2 {
    
    public static void main(String[] args) {
        WeatherData2 weatherData2 = new WeatherData2();
        
        CurrentConditionsDisplay2 currentDisplay2 = new CurrentConditionsDisplay2(weatherData2);
        StatisticsDisplay2 statisticsDisplay2 = new StatisticsDisplay2(weatherData2);
        ForecastDisplay2 forecastDisplay2 = new ForecastDisplay2(weatherData2);
        HeatIndexDisplay2 heatIndexDisplay2 = new HeatIndexDisplay2(weatherData2);
        
        weatherData2.setMeasurements(80, 65, 30.4f);
        weatherData2.setMeasurements(82, 70, 29.2f);
        weatherData2.setMeasurements(78, 90, 29.2f);
    }
}