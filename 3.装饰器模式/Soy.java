package starbuzzWithSizes;

public class Soy extends CondimentDecorator { //一种调味品，是装饰器的子类，装饰器是beverage的子类
    
    //Beverage beverage;
    
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    
    public double cost() {
        //return beverage.cost() + .20;
        double cost = beverage.cost(); //获得变量
        if(beverage.getSize() == Size.TALL) { //根据选取的大小中杯，加上不同调味的钱
            cost += .10;
        }else if(beverage.getSize() == Size.GRANDE) {
            cost += .15;
        }else if(beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}