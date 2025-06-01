package JavaObserverDesignpattern.MiniDuckSimulator;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.display();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
        rubberDuck.display();
    }
}
