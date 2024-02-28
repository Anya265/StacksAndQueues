package Challenge_2;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class TruckFleet_Anand{
    private ArrayList<Truck_Anand> trucks;
    private ArrayList<LinkedTransferQueue<Package_Anand>> warehouse;

    public TruckFleet_Anand(){
        this.trucks = new ArrayList<Truck_Anand>();
        this.warehouse = new ArrayList<LinkedTransferQueue<Package_Anand>>();
    }

    public void addTruck(Truck_Anand truck){
        trucks.add(truck);
        //storage.add(new LinkedTransferQueue<>());
    }
    public void addPackage(Package_Anand pack){
        boolean loaded = false;
        for(int packagesLoaded = 0; packagesLoaded < trucks.size(); packagesLoaded++){
            if(trucks.get(packagesLoaded).getArea().equals(pack.getArea()) && trucks.get(packagesLoaded).getNumPackages() < trucks.get(packagesLoaded).getMaxCapacity() && trucks.get(packagesLoaded).getMaxWeight() - trucks.get(packagesLoaded).amountOfWeight() >= pack.getWeight()){
                trucks.get(packagesLoaded).load(pack);
                loaded = true;
                //break;
            }
        }
        if(! loaded){
            LinkedTransferQueue<Package_Anand> packagesQueue = new       LinkedTransferQueue<Package_Anand>();
            packagesQueue.add(pack);
            warehouse.add(packagesQueue);
        }
    }

    public Package_Anand searchPackage(String address){
        for(LinkedTransferQueue <Package_Anand> packagesQueue : warehouse){
            for(Package_Anand pack : packagesQueue){
                if (pack.getAddress().equals(address))
                    return pack;
            }
        }
        return null;
    }

    public Truck_Anand searchTruck(String area){
        for(Truck_Anand truck : trucks){
            if(truck.getArea().equals(area)){
                return truck;
            }
        }
        return null;
    }

//    public void packageDelievered(String address){
//        for(LinkedTransferQueue<Package_Anand> packagesQueue : warehouse){
//            for(Package_Anand pack : packagesQueue){
//                if(pack.getAddress().equals(address)){
//                    packagesQueue.remove(pack);
//                    pack.setStatus("Delievered");
//                }
//            }
//        }
//        System.out.println("Package not Found");
//    }
public void packageDelievered(Package_Anand pack){
      pack.setStatus("Delievered");
    }

    public void returnTruck(String area){
        for(Truck_Anand truck : trucks){
            if(truck.getArea().equals(area)){
                truck.setLocation("Warehouse");
                System.out.println("Truck has returned to the Warehouse");
            }
        }
        System.out.println("Truck not found for the fleet in this area");
    }
    public String test(){
        return null;
    }

}