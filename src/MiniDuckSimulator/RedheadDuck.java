package MiniDuckSimulator;

public class RedheadDuck extends Duck  implements Quackable, Flyable{

    public RedheadDuck() {
        this.flyingBehaviour = new NormalDuckFlyingBehavior();
        this.quackingBehaviour = new NormalQuakBehaviour();
    }
    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }


}
