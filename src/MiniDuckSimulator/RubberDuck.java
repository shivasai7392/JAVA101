package MiniDuckSimulator;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyingBehaviour = new NoFlyingBehaviour();
        this.quackingBehaviour = new NoQuackingBehaviour();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
