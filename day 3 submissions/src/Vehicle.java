public class Vehicle {
    int vehicleId;
    String brandName;
    double price;
    static int count;

    Vehicle(int vehicleId, String brandName, double price){
        this.vehicleId=vehicleId;
        this.brandName=brandName;
        this.price=price;
        count++;
    }
    void details(){
        System.out.println("vehicleId "+ vehicleId);
        System.out.println("brandName "+ brandName);
        System.out.println("price "+ price);
    }
    public static void main(String[] args){
        Vehicle vh = new Vehicle(1, "audi", 100.00);
        Vehicle vh2 = new Vehicle(10, "benz", 101.00);
        Vehicle vh3 = new Vehicle(100, "rolls", 102.00);
        vh.details();
        vh2.details();
        vh3.details();
        System.out.println("count is: "+ count);

    }
}
