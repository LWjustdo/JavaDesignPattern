import java.util.Observable; //导入内置的可观察者超类
import java.util.Observer; //导入内置观察者接口

public class CurrentConditionsDisplay2 implements Observer, DisplayElement { //实现观察者接口
    
    Observable observable;
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay2(Observable observable) { //构造器需要可观察者对象
        this.observable = observable;
        observable.addObserver(this); //向可观察者添加观察者，类似于注册
    }
    
    public void update(Observable obs, Object arg) { //实现update()方法，增加可观察者和数据对象
        if(obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
    
    public void display() { //自定义布告
        System.out.println("Current conditions: " + temperature + 
                           "F degrees and " + humidity + "% humidity");
    }
}