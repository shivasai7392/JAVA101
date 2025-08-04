package StateDesignPattern;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, we are giving you a gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait, we are giving you a gumball");
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        }
        else {
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }
}
