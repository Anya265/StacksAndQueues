package Challenge_2;

import java.util.*;
public class TruckChallenge_Anand{
    public static void main(String[] args){


        //New trucks
        TruckFleet_Anand warehouse = new TruckFleet_Anand();
        Truck_Anand truck1 = new Truck_Anand(15, 200.0, "Freehold", "Warehouse", 0);
        Truck_Anand truck2 = new Truck_Anand(7, 100.0, "Manalapan", "Warehouse", 0);
        Truck_Anand truck3 = new Truck_Anand(2, 75.0, "Colts Neck", "Warehouse", 0);
        Truck_Anand truck4 = new Truck_Anand(25, 300.0, "Howell", "Warehouse", 0);
        Truck_Anand truck5 = new Truck_Anand(21, 250.0, "Marlboro", "Warehouse", 0);
        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);
        System.out.println();

        Package_Anand package1 = new Package_Anand(20.0, "Manalapan", "101 Road St", "Warehouse");
        Package_Anand package2 = new Package_Anand(100.0, "Manalapan", "300 Street Rd", "Warehouse");
        Package_Anand package3 = new Package_Anand(150.0, "Freehold", "32 Avenue Rd", "Warehouse");
        Package_Anand package4 = new Package_Anand(10.0, "Freehold", "1 Main St", "Warehouse");
        Package_Anand package5 = new Package_Anand(15.0, "Freehold", "15 Temple Rd", "Warehouse");
        Package_Anand package6 = new Package_Anand(16.0, "Freehold", "3 My Rd", "Warehouse");
        Package_Anand package7 = new Package_Anand(1.0, "Marlboro", "4 Goldstein Way", "Warehouse");
        Package_Anand package8 = new Package_Anand(15.0, "Marlboro", "15 Goldstein Way", "Warehouse");
        Package_Anand package9 = new Package_Anand(35.0, "Freehold", "53 CompSci Ct", "Warehouse");
        Package_Anand package10 = new Package_Anand(54.0, "Marlboro", "32 ColtsNeck Rd", "Warehouse");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);

        //test method
        warehouse.test();

        //Next location
        System.out.println("Truck 1's next location: " + truck1.nextLocation());
        System.out.println("Truck 2's next location: " + truck2.nextLocation());
        System.out.println("Truck 3's next location: " + truck3.nextLocation());
        System.out.println("Truck 4's next location: " + truck4.nextLocation());
        System.out.println("Truck 5's next location: " + truck5.nextLocation());

        //test method
        warehouse.test();

        //Next location
        System.out.println(warehouse.searchTruck("Freehold").nextLocation());
        System.out.println(warehouse.searchTruck("Manalapan").nextLocation());
        System.out.println(warehouse.searchTruck("Colts Neck").nextLocation());
        System.out.println(warehouse.searchTruck("Howell").nextLocation());
        System.out.println(warehouse.searchTruck("Marlboro").nextLocation());

        //Running it until it all trucks are empty
        while(warehouse.searchTruck("Freehold").getNumPackages() > 0){
            warehouse.packageDelievered(warehouse.searchTruck("Freehold").unload());
            System.out.println(warehouse.searchTruck("Freehold").nextLocation());
        }
        while(warehouse.searchTruck("Manalapan").getNumPackages() > 0){
            warehouse.packageDelievered(warehouse.searchTruck("Manalapan").unload());
            System.out.println(warehouse.searchTruck("Manalapan").nextLocation());
        }
        while(warehouse.searchTruck("Colts Neck").getNumPackages() > 0){
            warehouse.packageDelievered(warehouse.searchTruck("Colts Neck").unload());
            System.out.println(warehouse.searchTruck("Colts Neck").nextLocation());
        }
        while(warehouse.searchTruck("Howell").getNumPackages() > 0){
            warehouse.packageDelievered(warehouse.searchTruck("Howell").unload());
            System.out.println(warehouse.searchTruck("Howell").nextLocation());
        }
        while(warehouse.searchTruck("Marlboro").getNumPackages() > 0){
            warehouse.packageDelievered(warehouse.searchTruck("Marlboro").unload());
            System.out.println(warehouse.searchTruck("Marlboro").nextLocation());
        }

        //Return warehouse
        warehouse.test();

        truck1.setLocation("Warehouse");
        truck2.setLocation("Warehouse");
        truck3.setLocation("Warehouse");
        truck4.setLocation("Warehouse");
        truck5.setLocation("Warehouse");

        System.out.println(package1.getStatus());
        System.out.println(package2.getStatus());
        System.out.println(package3.getStatus());
        System.out.println(package4.getStatus());
        System.out.println(package5.getStatus());
        System.out.println(package6.getStatus());
        System.out.println(package7.getStatus());
        System.out.println(package8.getStatus());
        System.out.println(package9.getStatus());
        System.out.println(package10.getStatus());






    }
}
