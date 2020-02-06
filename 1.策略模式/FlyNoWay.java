public class FlyNoWay implements FlyBehavior {  //飞行行为具体实现类
    
    public void fly() {  //实现接口中的具体方法，不会飞的鸭子
        System.out.println("I cant fly!");
    }
}