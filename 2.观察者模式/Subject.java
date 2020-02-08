public interface Subject { //建立主题接口
    
    public void registerObserver(Observer o); //注册观察者（订阅报纸的人）
    public void removeObserver(Observer o); //删除观察者（取消订阅报纸）
    public void notifyObservers(); //当主题状态改变时，这个方法被调用，通知所有观察者（给订阅的人分发报纸）
}