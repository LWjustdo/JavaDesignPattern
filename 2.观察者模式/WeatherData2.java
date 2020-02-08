import java.util.Observer;  //java内置观察者接口
import java.util.Observable;  //java内置主题超类

public class WeatherData2 extends Observable {  //继承可观察超类，获得很多现成的继承方法，实现一个主题
    
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData2() {
        
    }
    
    public void measurementsChanged() {
        setChanged(); //标记状态已经改变，也是预留是否加入通知观察者的逻辑
        notifyObservers(); //通知观察者，没有传送主题对象，我们在观察者中采用pull的方式获得数据
        //notifyObservers(Observable o, Object arg) 如果想用push的方式把主题数据推向观察者，如上所述
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public float getTemperature() { //因为我们使用pull的方法获得数据，实现get方法可以使观察者获得数据
        return temperature;
    }
    
    public float getHumidity() {
        return humidity;
    }
    
    public float getPressure() {
        return pressure;
    }
}