public class DarkRoast extends Beverage{
    public DarkRoast(SizeType size) {
        description = "Dark Roast";
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}
