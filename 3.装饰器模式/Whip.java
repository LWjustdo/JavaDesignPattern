package starbuzzWithSizes;

public class Whip extends CondimentDecorator { //一种调味品，是装饰器的子类，装饰器是beverage的子类
    
    Beverage beverage;
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    
    public double cost() {
        return beverage.cost() + .15;
    }
}