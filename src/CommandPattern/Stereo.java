package CommandPattern;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + "Stereo on");
    }
    public void off() {
        System.out.println(name + "Stereo off");
    }
    public void setCd(){
        System.out.println(name + "Stereo setCd");
    }
    public void setDVD(){
        System.out.println(name + "Stereo setDVD");
    }
    public void setRadio(){
        System.out.println(name + "Stereo setRadio");
    }
    public void setVolume(int volume){
        System.out.println(name + "Stereo Volume set to " + volume);
    }
}
