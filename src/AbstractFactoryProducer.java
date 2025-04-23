public class AbstractFactoryProducer {
    public AbstractCarFactory getFactoryInstance(String value){
        if (value.equals("Economy")){
            return new EconomicCarFactory();
        }
        else if (value.equals("Luxury") || value.equals("Premium")){
            return new LuxuryCarFactory();
        }
        return null;
    }
}

