package StateDesignPattern;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no more quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You have to pay first");
    }
}
