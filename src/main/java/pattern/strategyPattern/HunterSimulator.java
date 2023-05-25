package pattern.strategyPattern;

import pattern.strategyPattern.duck.Duck;
import pattern.strategyPattern.duck.MallardDuck;
import pattern.strategyPattern.duck.ModelDuck;
import pattern.strategyPattern.fly.FlyRocketPowered;
import pattern.strategyPattern.sound.Quack;
import pattern.strategyPattern.sound.QuackBehavior;

public class HunterSimulator {
    public static void main(String[] args) {
        QuackBehavior quackBehavior = new Quack();

        quackBehavior.quack();
        quackBehavior.quack();


    }

}
