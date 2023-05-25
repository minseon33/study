package pattern.strategyPattern.duck;

import pattern.strategyPattern.duck.Duck;
import pattern.strategyPattern.fly.FlyNoWay;
import pattern.strategyPattern.sound.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 오리모형 입니다.");
    }
}
