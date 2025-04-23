public class FactoryDesign {
    public static void main(String[] args) {
        Shapefactory shapefactory = new Shapefactory();
        Shape shape = shapefactory.getInstanceShape("Triangle");
    }
}

