package StateDesignPattern;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;
    State soldState;
    State state;

    public void setState(State state) {
        this.state = state;
    }

    int count = 0;
    public GumballMachine(int numOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        soldState = new SoldState(this);
        this.count = numOfGumballs;
        if (numOfGumballs > 0) {
            state = noQuarterState;
        }
        else {
            state = soldOutState;
        }
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        if (state == soldState || state == winnerState) {
            state.dispense();
        }
    }
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot....");
        if (this.count > 0){
            this.count--;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
