package Vehicle_Regi;

public class Car extends Vehicle{
     private int doors ;
     
    public Car(String brand,String model,int door){
        super(brand,model);
        this.doors = door;
    }

    @Override
    public void displayInfo(){
        System.out.print("Car brand:"+this.getBrand()+" Model:"+this.getModel()+"Doors: "+this.doors);
     }
}
