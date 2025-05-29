public class Espresso extends Beverage {
    public Espresso(SizeType size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
