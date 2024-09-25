package Vehicle_Regi;

public class Vehicle {
 private String brand;
 private String model;
 
 public Vehicle(String brand, String model){
  this.brand = brand;
  this.model = model;
 }

 public void setBrand(String brand){
    this.brand = brand;
 }
 public void setModel(String model){
    this.model = model;
 }
 public String getBrand(){
    return this.brand;
 }
 public String getModel(){
    return this.model;
 }

 
 public void displayInfo(){
    System.out.println("Main Vehicle class");
 }

}
