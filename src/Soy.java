public class Soy extends CondimentsDecorator{
    private Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public SizeType getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        SizeType size = beverage.getSize();
        if (size.equals(SizeType.TALL)){
            return 0.1 + beverage.cost();
        } else if (size.equals(SizeType.VENTI)) {
            return 0.15 + beverage.cost();
        }
        return .20 + beverage.cost();
    }
}
