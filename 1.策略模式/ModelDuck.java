public class ModelDuck extends Duck {  //模型鸭，继承鸭子超类
    
    public ModelDuck() {  //构造函数，把继承来的实例变量初始化成具体的行为实现子类
        flyBehavior = new FlyNoWay(); //不会飞
        quackBehavior = new Quack();
    }
    
    public void display() {  //实现超类中的抽象方法
        System.out.println("Im a model Duck!");
    }
}