package CommandPattern;

public class GardenLight {
    public void setDuskTime(int duskTime){
        System.out.println("GardenLight setDuskTime set to "+duskTime);
    }
    public void setDawnTime(int dawnTime){
        System.out.println("GardenLight setDawnTime set to "+dawnTime);
    }
    public void manualOn(){
        System.out.println("GardenLight manualOn");
    }
    public void manualOff(){
        System.out.println("GardenLight manualOff");
    }

}
