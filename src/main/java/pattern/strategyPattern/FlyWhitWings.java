package pattern.strategyPattern;

public class FlyWhitWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고있어요!");
    }
}
