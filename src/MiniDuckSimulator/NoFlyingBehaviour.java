package MiniDuckSimulator;

public class NoFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("NoFlyingBehaviour");
    }
}
