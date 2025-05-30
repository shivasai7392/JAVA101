package MiniDuckSimulator;

public class MallardDuck extends Duck implements Quackable, Flyable {

    public MallardDuck() {
        this.flyingBehaviour = new NormalDuckFlyingBehavior();
        this.quackingBehaviour = new NormalQuakBehaviour();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
