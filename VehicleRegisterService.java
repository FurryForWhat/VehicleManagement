package Vehicle_Regi;

import java.util.Scanner;

public class VehicleRegisterService {
    public static void main(String[] args){
        // Vehicle v1 = new Vehicle("Donno", "Ransom");
        
        // Car bmw = new Car("BMW_Oxform", "X-seriesJ90", 4);
        
        // bmw.displayInfo();
        // System.out.print("\n");
        // v1.displayInfo();
        // System.out.print("\n");
        Scanner scan= new Scanner(System.in);
        Vehicle v1 = null;

        System.out.println("Enter vehicle type(car/truck/motorcycle):");
        String type = scan.nextLine().toLowerCase();

        System.out.println("Enter brand: ");
        String brand = scan.nextLine();

        System.out.println("Enter Model: ");
        String model = scan.nextLine();

        switch (type) {
            case "car":
                System.out.print("Enter number of doors:");
                int doors = scan.nextInt();
                v1= new Car(brand, model, doors);
                break;
            case "truck":
                System.out.println("Enter payload capacity (in tons): ");
                double payloadCapacity = scan.nextDouble();
                v1 = new Truck(brand, model, payloadCapacity);
                break;
            case "motorcycle":
                System.out.println("Does it have a sidecar? (true/false): ");
                boolean hasSidecar = scan.nextBoolean();
                v1 = new Motorcycle(brand, model, hasSidecar);
                break;
            default:
                System.out.println("Invalid vehicle type.");
                break;
        }
        if (v1 != null) {
            v1.displayInfo();
        }

        scan.close();
    }

}
