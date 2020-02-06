public class MuteQuack implements QuackBehavior { //鸭叫行为具体实现类
    
    public void quack() {  //不会叫的鸭子
        System.out.println("<< Silence >>");
    }
}