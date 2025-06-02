package CommandPattern;

public class CeilingLight {
    String name;

    public CeilingLight(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("CeilingLight on");
    }
    public void off(){
        System.out.println("CeilingLight off");
    }
}
