
public abstract class Duck { //抽象类鸭子
    
    FlyBehavior flyBehavior;  //为行为接口类型声明引用变量，所有鸭子类（同一个packa中）都继承它们
    QuackBehavior quackBehavior;  //具体行为在行为接口中定义，鸭子不关心，只要实现接口中的具体方法就行
    
    public Duck() { //构造函数

    }
    
    public abstract void display(); //抽象方法，子类中实现
    
    public void performFly() {    
        flyBehavior.fly();    //委托给行为类
    }
    
    public void performQuack() {    
        quackBehavior.quack();    //委托给行为类
    }
    
    public void swim() { //抽象类中的方法，所有鸭子都会游泳，甚至是假鸭子
        System.out.println("All ducks float, even decoys!");
    }
    
    public void setFlyBehavior(FlyBehavior fb) {    
        this.flyBehavior = fb;    //动态改变行为类
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;    //动态改变行为类
    }
}