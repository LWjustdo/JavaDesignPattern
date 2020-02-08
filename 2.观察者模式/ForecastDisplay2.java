import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay2 implements Observer, DisplayElement {
    
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;
    
    public ForecastDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    public void update(Observable obs, Object arg) {  //实现update()获得数据改变，进行布告display()
        if(obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            lastPressure = currentPressure;            
            currentPressure = weatherData2.getPressure();
            display();
        }
    }
    
    public void display() {  //自定义布告方式，每个观察者都不一样
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        }else if(currentPressure == lastPressure) {
            System.out.println("More of the same");
        }else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, ranig weather");
        }
    }
}