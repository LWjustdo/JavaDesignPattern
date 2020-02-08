public class WeatherStation { //建立天气站
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); //建立一个天气数据对象
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); //建立一批观察者，并且进行注册
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f); //获得改变的主题数据，一对多进行布告
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}