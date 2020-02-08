public class CurrentConditionsDisplay implements 
                Observer, DisplayElement {  //实现了Observer接口，所以可以从WeatherData对象中获得改变，实现了DisplayElement可以进行布告
    
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) { //构造器需要主题对象作为注册之用
        this.weatherData = weatherData;
        weatherData.registerObserver(this); //构造函数中向主题注册这个观察者
    }
    
    public void update(float temperature, float humidity, float pressure) { //实现update()获得数据改变，进行布告display()
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {  //自定义布告方式，每个观察者都不一样
        System.out.println("Current conditions: " + temperature + 
                           "F degrees and " + humidity + "% humidity");
    }
}