package Challenge_2;

public class Package_Anand {
    private double weight;
    //matching packets to truck
    private String area;
    private String address;
    private String status;

    public Package_Anand(double weight, String area, String address, String status){
        this.weight = weight;
        this.area = area;
        this.address = address;
        this.status = status;
    }
    public double getWeight(){
        return weight;
    }
    public String getArea(){
        return area;
    }
    public String getAddress(){
        return address;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
