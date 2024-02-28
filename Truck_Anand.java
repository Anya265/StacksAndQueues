package Challenge_2;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class Truck_Anand{
    private int maxCapacity;
    private double maxWeight;
    private String area;
    private String location;
    private int numPackages;

    Stack<Package_Anand> packages = new Stack<Package_Anand>();
    private LinkedTransferQueue<Package_Anand> warehouse;

    public Truck_Anand(int maxCapacity, double maxWeight, String area, String location, int numPackages){
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.area = area;
        this.location = location;
        this.numPackages = numPackages;
        this.packages = new Stack<>();
        this.warehouse = new LinkedTransferQueue<Package_Anand>();
    }
    public double getMaxWeight(){

        return maxWeight;
    }
    public int getMaxCapacity(){

        return maxCapacity;
    }
    public String getArea(){

        return area;
    }
    public String getLocation(){

        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public int getNumPackages(){
        return numPackages;
    }
    public int numberOfPackages(){
        return packages.size();
    }
    public double amountOfWeight(){
        double weight = 0.0;
        for(Package_Anand curr : packages){
            weight+=curr.getWeight();
        }
        return weight;
    }
    public String nextLocation(){
        if(packages.isEmpty()){
            return "No packages in the truck";
        }
        else{
            return packages.peek().getAddress();
      }
    }
    public void load(Package_Anand pack){
        if(amountOfWeight() + pack.getWeight() <= maxWeight && numberOfPackages() < maxCapacity){
            packages.push(pack);
            System.out.println("Package inside the truck");
        }
        else{
            System.out.println("The truck is full and no more packages can be loaded.");
        }
    }

    //do you want us to return it
    public Package_Anand unload(){
        if(packages.isEmpty()){
            System.out.println("Finished dropping all packages");
            return null;
        }
        else{
            Package_Anand unloadedPackages = packages.pop();
            return unloadedPackages;
        }
    }
    public boolean ifPackageInArea(String area){
        boolean packageInArea = false;
        for(Package_Anand curr : packages){
            //should this be getArea or getLocation
            if(curr.getArea().equals(area))
                packageInArea = true;
        }
        return packageInArea;
    }

    //elaboration on the eight requirnment
    public void singlePackage(Package_Anand pack){
        if(maxWeight <= amountOfWeight() || numberOfPackages() == maxCapacity || (!(packages.isEmpty()))){
            setLocation(packages.peek().getAddress());
            packages.pop();
        }
    }

    public void startDelievering(){
        for(Package_Anand curr : packages){
            singlePackage(curr);
        }
    }


}
