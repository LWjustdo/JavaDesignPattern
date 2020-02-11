package starbuzzWithSizes;

public abstract class Beverage { //抽象类
    
    String description = "Unkown Beverage"; //给子类继承
    public enum Size {TALL, GRANDE, VENTI}; //枚举，大小中杯咖啡
    Size size = Size.TALL; //预设一个大小
    
    public String getDescription() { //已经在抽象类中实现的方法，子类直接继承
        return description;
    }
    
    public abstract double cost(); //抽象方法，必须在子类中实现
    
    public Size getSize() {  //获得大小中杯
        return this.size;
    }
    
    public void setSize(Size size) {
        this.size = size;   
    }
}