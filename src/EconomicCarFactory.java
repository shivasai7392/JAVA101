public class EconomicCarFactory implements AbstractCarFactory{

    @Override
    public Car getCarBasedOnTopSpeed(int topSpeed) {
        Car car = null;
        if (topSpeed < 100){
            car = new EconomicCar1();
        }
        else if (topSpeed < 200){
            car = new EconomicCar2();
        }
        return car;
    }
}

