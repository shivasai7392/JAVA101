package CommandPattern;

public class TV {
    public void on(){
        System.out.println("TV on");
    }
    public void off(){
        System.out.println("TV off");
    }
    public void setInputChannel(int channel){
        System.out.println("TV setInputChannel to "+channel);
    }
    public void setVolume(int volume){
        System.out.println("TV setVolume to "+volume);
    }
}
