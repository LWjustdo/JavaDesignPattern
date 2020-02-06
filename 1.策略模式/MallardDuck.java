public class MallardDuck extends Duck { //绿头鸭，继承了鸭子超类
    
    public MallardDuck() { //构造函数，把继承来的实例变量初始化成具体的行为实现子类
        quackBehavior = new Quack(); 
        flyBehavior = new FlyWithWings();
    }
    
    public void display() { //子类必须实现继承来的抽象方法
        System.out.println("Im a real Mallard Duck!");
    }
}