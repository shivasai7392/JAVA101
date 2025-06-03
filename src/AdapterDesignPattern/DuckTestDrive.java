package AdapterDesignPattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
