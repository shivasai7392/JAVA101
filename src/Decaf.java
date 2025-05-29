public class Decaf extends Beverage{
    public Decaf(SizeType size) {
        description = "Decaf";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
