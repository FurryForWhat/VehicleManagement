package Vehicle_Regi;

public class Motorcycle extends Vehicle{
 private boolean hasSidecar;
 
 public Motorcycle(String model,String brand,boolean has){
 super(brand,model);
 this.hasSidecar= has;
 }
 @Override
    public void displayInfo(){
        System.out.print("Car brand:"+this.getBrand()+" Model:"+this.getModel()+" HaveSideCar?: "+this.hasSidecar);
     }
}
