class Vehicles {
    int mileage;
    double price;

    Vehicles(int mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }

    void getVehicleDisplay() {
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}

class Car extends Vehicles {
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;

    Car(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    void getCarDisplay() {
        getVehicleDisplay();
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bike extends Vehicles {
    int numCylinders;
    int numGears;
    String coolingType;
    String wheelType;
    int fuelTankSize;

    Bike(int mileage, double price, int numCylinders, int numGears, String coolingType, String wheelType, int fuelTankSize) {
        super(mileage, price);
        this.numCylinders = numCylinders;
        this.numGears = numGears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
    }

    void getBikeDetails() {
        getVehicleDisplay();
        System.out.println("Num Cylinders: " + numCylinders);
        System.out.println("Num Gears: " + numGears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize);
    }
}

// Audi Class
class Audi extends Car {
    String modelType;

    Audi(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void AudiDetails() {
        getCarDisplay();
        System.out.println("Model Type: " + modelType);
    }
}

class Ford extends Car {
    String modelType;

    Ford(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void FordDisplay() {
        getCarDisplay();
        System.out.println("Model Type: " + modelType);
    }
}

class Bajaj extends Bike {
    String makeType;

    Bajaj(int mileage, double price, int numCylinders, int numGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, numCylinders, numGears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    void BajajDetails() {
        getBikeDetails();
        System.out.println("Make Type: " + makeType);
    }
}

class TVS extends Bike {
    String makeType;

    TVS(int mileage, double price, int numCylinders, int numGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, numCylinders, numGears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    void TvsDetails() {
        getBikeDetails();
        System.out.println("Make Type: " + makeType);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Audi audi = new Audi(15, 3500000, 50000, 3, 5, "Petrol", "A6");
        Ford ford = new Ford(12, 2500000, 40000, 2, 5, "Diesel", "Mustang");
        Bajaj bajaj = new Bajaj(60, 70000, 2, 4, "Air", "Alloys", 12, "Bajaj Pulsar");
        TVS tvs = new TVS(55, 60000, 1, 4, "Oil", "Spokes", 10, "TVS Apache");

        System.out.println("--- Audi Details ---");
        audi.AudiDetails();

        System.out.println("\n--- Ford Details ---");
        ford.FordDisplay();

        System.out.println("\n--- Bajaj Details ---");
        bajaj.BajajDetails();

        System.out.println("\n--- TVS Details ---");
        tvs.TvsDetails();
    }
}
