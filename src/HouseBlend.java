public class HouseBlend extends Beverage{
    public HouseBlend(SizeType size) {
        description = "HouseBlend";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
