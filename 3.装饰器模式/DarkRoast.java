package starbuzzWithSizes;

public class DarkRoast extends Beverage {  //DarkRoast是一种咖啡
    
    public DarkRoast() {
        description = "DarkRoast Coffee"; //description实例变量继承至超类
    }
    
    public double cost() { //有自定义的价格
        return .99;
    }
}