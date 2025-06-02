package CommandPattern;

public class CeilingFan {
    Speed speed;
    String name;

    public CeilingFan(String name) {
        this.name = name;
        speed = Speed.OFF;
    }

    public void high(){
        speed = Speed.HIGH;
        System.out.println(name + "CeilingFan high");
    }
    public void low(){
        speed = Speed.LOW;
        System.out.println(name + "CeilingFan low");
    }
    public void medium(){
        speed = Speed.MEDIUM;
        System.out.println(name + "CeilingFan medium");
    }
    public void off(){
        speed = Speed.OFF;
        System.out.println(name + "CeilingFan off");
    }

    public Speed getSpeed() {
        return speed;
    }

}
