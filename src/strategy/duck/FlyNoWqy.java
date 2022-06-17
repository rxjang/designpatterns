package strategy.duck;

public class FlyNoWqy implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("나는 못 날아요");
    }
}
