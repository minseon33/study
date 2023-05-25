package pattern.strategyPattern.sound;

import pattern.strategyPattern.sound.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
