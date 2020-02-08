public class ForecastDisplay implements Observer, DisplayElement {  //实现了Observer接口，所以可以从WeatherData对象中获得改变，实现了DisplayElement可以进行布告
    
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;
    
    public ForecastDisplay(Subject weatherData) {   //构造器需要主题对象作为注册之用
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  //注册这个观察者
    }
    
    public void update(float temp, float humididy, float pressure) {  //实现update()获得数据改变，进行布告display()
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
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