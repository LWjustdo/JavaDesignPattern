package starbuzzWithSizes;

import starbuzzWithSizes.Beverage.Size;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso(); //买一杯Espresso， 不需要调味
        System.out.println(beverage.getDescription() + " $ " + beverage.cost()); //获得什么咖啡，多少钱
        
        Beverage beverage2 = new DarkRoast(); //买一杯DarkRoast
        beverage2 = new Mocha(beverage2); //加摩卡调料
        beverage2 = new Mocha(beverage2); //再加摩卡调料
        beverage2 = new Whip(beverage2); //加whip调料
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.GRANDE); //买中杯
        beverage3 = new Soy(beverage3); //加调料
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }

}