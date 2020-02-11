package starbuzzWithSizes;

public class Mocha extends CondimentDecorator { //一种调味品，是装饰器的子类，装饰器是beverage的子类
    
    //Beverage beverage;
    
    public Mocha(Beverage beverage) { //让被装饰者记录在实例变量中，把被装饰者当作构造器参数，进行记录
        this.beverage = beverage;
    }
    
    public String getDescription() {  //不只是描述咖啡，还描述调味料，所以委托获得一个描述，加上特有的描述
        return beverage.getDescription() + ", Mocha";
    }
    
    public double cost() { //委托获得咖啡的钱，加上调味料的钱
        return .20 + beverage.cost();
    }
}