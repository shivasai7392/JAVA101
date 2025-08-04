package StateDesignPattern;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn the crank");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner!! you get two gumballs");
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.releaseBall();
            if (this.gumballMachine.getCount() > 0) {
                this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
            }
            else {
                this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
            }
        }
        else {
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }
}
