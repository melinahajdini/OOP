package com.company.online1_java2;

public class MainOnline1 {
    public static void main(String[] args) {
        System.out.println(Vehicle.getVehicleCount());
          Vehicle vehicle = new Vehicle();
        System.out.println(Vehicle.getVehicleCount());
        Vehicle vehicle1 = new Vehicle("BMW","X5",280f);
        System.out.println(Vehicle.getVehicleCount());
    }
}
