public class DecoratorDesign {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(SizeType.GRANDE);
        System.out.println(beverage.getDescription() +" costs $"+ beverage.cost());

        Beverage beverage2 = new Espresso(SizeType.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +" costs $"+ beverage2.cost());


    }
}
