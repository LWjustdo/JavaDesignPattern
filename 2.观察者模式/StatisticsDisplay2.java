import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay2 implements Observer, DisplayElement {
    
    Observable observable;
    private float temperature;
    private float maxTemp = 0.0f;
    private float minTemp = 2000;
    private float tempSum = 0.0f;
    private int numReadings;
    
    public StatisticsDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            tempSum += temperature;
            numReadings++;
        
            if(temperature > maxTemp) {
                maxTemp = temperature;
            }
        
            if(temperature < minTemp) {
                minTemp = temperature;
            }
        
            display();
        }
    }
    
    public void display() {  
        System.out.println(" Avg/Max/Min temperature = " + (tempSum / numReadings) + " / " +
                            maxTemp + " / " + minTemp);
    }
}