package starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage { //必须让Condiment装饰器能够取代Beverage，所以拓展至beverage
    
    public Beverage beverage; //让子类中都有这个示例变量，也就是被装饰者
    
    public abstract String getDescription();  //子类必须重新实现getDescription();
    
    public Size getSize() {  //获得大小
        return beverage.getSize();
    }
}