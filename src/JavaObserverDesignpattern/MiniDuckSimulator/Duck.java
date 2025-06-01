package JavaObserverDesignpattern.MiniDuckSimulator;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    public abstract void display();
    public void swim() {
        System.out.println("Duck swimming");
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }

    public void fly() {
        this.flyingBehaviour.fly();
    }

    public void quack() {
        this.quackingBehaviour.quack();
    }
}
