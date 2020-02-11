package starbuzzWithSizes;

public class Milk extends CondimentDecorator {  //一种调味品，是装饰器的子类，装饰器是beverage的子类
    
    //Beverage beverage;
    
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    
    public double cost() {
        return beverage.cost() + .20;
    }
}