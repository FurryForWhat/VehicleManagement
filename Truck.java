package Vehicle_Regi;

public class Truck extends Vehicle{
    private double payloadCapacity ;
    
    public Truck(String brand,String model,double payload){
        super(brand,model);
        this.payloadCapacity = payload;
    }

    @Override
    public void displayInfo(){
        System.out.print("Car brand:"+this.getBrand()+" Model:"+this.getModel()+"payloadCapacity: "+this.payloadCapacity);
     }
}
