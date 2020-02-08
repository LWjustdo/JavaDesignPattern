import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement { //实现了Observer接口，所以可以从WeatherData对象中获得改变，实现了DisplayElement可以进行布告
    
    private Subject weatherData;
    private float temperature;
    private float maxTemp = 0.0f;
    private float minTemp = 2000;
    private float tempSum = 0.0f;
    private int numReadings;
    
    public StatisticsDisplay(Subject weatherData) {  //构造器需要主题对象作为注册之用
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  //注册这个观察者
    }
    
    public void update(float temperature, float humidity, float pressure) {  //实现update()获得数据改变，进行布告display()
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
    
    public void display() {  //自定义布告方式，每个观察者都不一样
        System.out.println(" Avg/Max/Min temperature = " + (tempSum / numReadings) + " / " +
                            maxTemp + " / " + minTemp);
    }
}