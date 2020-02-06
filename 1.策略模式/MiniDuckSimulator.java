public class MiniDuckSimulator { //鸭子模拟器类
    
    public static void main(String[] args) { //主函数，程序入口
        Duck mallard = new MallardDuck(); //实例化绿头鸭，引用变量为超类，实现多态
        mallard.performQuack(); //绿头鸭叫，具体实现为对象实例的初始化引用变量中具体实现子类
        mallard.performFly();  //绿头鸭飞，具体实现为对象实例的初始化引用变量中具体实现子类
        
        Duck model = new ModelDuck(); //实例化模型鸭，引用变量为超类，实现多态
        model.performFly(); //模型鸭不会飞
        model.setFlyBehavior(new FlyRocketPowered()); //运行时动态改变鸭子的行为
        model.performFly(); //模型鸭坐火箭了，会飞了
    }
}