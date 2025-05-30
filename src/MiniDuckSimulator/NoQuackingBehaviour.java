package MiniDuckSimulator;

public class NoQuackingBehaviour implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("NoQuackingBehaviour");
    }
}
