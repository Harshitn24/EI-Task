// Vehicle interface
interface Vehicle {
    void drive();
}

// Concrete products
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck.");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike.");
    }
}

// Factory interface
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete factories
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}

class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

// Demo
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();
    }
}
