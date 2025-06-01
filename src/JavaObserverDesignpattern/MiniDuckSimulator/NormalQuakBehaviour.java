package JavaObserverDesignpattern.MiniDuckSimulator;

public class NormalQuakBehaviour implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Normal Duck Quacking");
    }
}
