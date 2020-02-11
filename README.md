# JavaDesignPattern
Recording the software design patterns
---
## 1.策略模式，我们封装了一群鸭子，实现不同的鸭子，叫声不同，行为不同等
1.封装变化  
2.针对接口编程，不针对实现编程  
3.多用组合，少用继承 
4.策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户 

---
## 2.观察者模式，我们封装实现了一个天气预报气象站，一个气象站有多个布告板，一对多的典型示例
1.我们自己实现了一个气象站WeatherStation，也用java内置的Observer(观察者)和Observable(主题)进行了实现WeatherStation2  
2.为交互对象之间的松耦合设计而努力  
3.观察者模式在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新，类似于订阅报纸:) 

--- 
## 3.装饰器模式，我们实现了一个starbuzzCoffee程序，可以动态的将责任附加到对象上，想要拓展功能（加调味），装饰者提供有别于继承的另一种选择  
1. 有了开放-关闭原则引导我们，我们会努力设计系统，让关闭的部分和新的拓展进行分离  
2 .装饰者类反映出被装饰的组件类型，他们都具有相同的类型，都经过接口或者继承实现   
3. 装饰者可以在被装饰者的行为前面或后面加上自己的行为，甚至取代被装饰者的行为，而达到特定的目的
