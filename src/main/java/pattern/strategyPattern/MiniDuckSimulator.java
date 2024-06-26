package pattern.strategyPattern;

import pattern.strategyPattern.duck.Duck;
import pattern.strategyPattern.duck.MallardDuck;
import pattern.strategyPattern.duck.ModelDuck;
import pattern.strategyPattern.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println(" ");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }

}
