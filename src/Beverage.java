public abstract class Beverage {
    SizeType size;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public SizeType getSize() { return size; }

    public abstract double cost();
}


