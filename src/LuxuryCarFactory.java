public class LuxuryCarFactory implements AbstractCarFactory{

    @Override
    public Car getCarBasedOnTopSpeed(int topSpeed) {
        Car car = null;
        if (topSpeed > 500){
            car = new LuxuryCar1();
        }
        else if (topSpeed > 200){
            car = new LuxuryCar2();
        }
        return car;
    }
}
