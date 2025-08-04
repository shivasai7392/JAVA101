package StateDesignPattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs, can't insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No gumballs, can't eject a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("No gumballs, can't turn the crank");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs, can't dispense");
    }
}
