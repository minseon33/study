package pattern.strategyPattern.duck;

import pattern.strategyPattern.fly.FlyWhitWings;
import pattern.strategyPattern.sound.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWhitWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }

}
