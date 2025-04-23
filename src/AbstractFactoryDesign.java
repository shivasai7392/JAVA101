public class AbstractFactoryDesign{
    public static void main(String[] args) {
        AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();
        AbstractCarFactory abstractCarFactory = factoryProducer.getFactoryInstance("Luxury");
        Car car = abstractCarFactory.getCarBasedOnTopSpeed(550);
        System.out.println(car);
    }
}
