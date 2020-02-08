public interface Observer { //建立观察者接口
    
    public void update(float temp, float humidity, float pressure);  //所有观察者必须实现update()方法，用这个方法响应主题改变
}