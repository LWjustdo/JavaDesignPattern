import java.util.*;

public class WeatherData implements Subject { //实现主题接口
    
    private ArrayList observers;  //加上一个数组记录观察者
    private float temperature; //温度
    private float humidity;  //湿度
    private float pressure; //压力
    
    public WeatherData() {
        this.observers = new ArrayList(); //数组在构造器中进行建立
    }
    
    public void registerObserver(Observer o) { //注册观察者，加入数组中
        observers.add(o);
    }
    
    public void removeObserver(Observer o) { //删除观察者，移除数值
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }
    
    public void notifyObservers() {  //把主题变化的状态告诉所有观察者
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure); //因为所有观察者都实现了update()
        }
    }
    
    public void measurementsChanged() { //当气象站得到更新观测值时候，我们通知观察者，这个是一个灵活的设计，以防通知观察者
                                        //的时候加入处理逻辑，比如变化没有超过阈值就不通知观察者，先预留这个方法
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) { //调用这个方法设置主题变化，模拟气象站数据接收变化
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();  //处理变化
    }
    
}