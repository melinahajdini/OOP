package com.company.online1_java2;

public class Vehicle {
    private  static int vehicleCount=0;
    public static int getVehicleCount() {
        return vehicleCount;
    }
    private  String mark;
    private String model;
    private String type;
    private String color;
    private float actualSpeed;
    private float maxSpeed;
    private short power;
    private byte transition;
    private String fuelType;
    private byte doors;
    private String vin;
    private boolean isManuasl;
    private boolean isTransport;
    private byte seats;
    private short productionYear;



    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(float actualSpeed) {
        if(actualSpeed >= 0 && actualSpeed <= maxSpeed)
        this.actualSpeed = actualSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        if(maxSpeed >=0 && maxSpeed <=400)
        this.maxSpeed = maxSpeed;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public byte getTransition() {
        return transition;
    }

    public void setTransition(byte transition) {
        if(transition>=-1 && transition<=7)
        this.transition = transition;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if(vin!=null && vin.length()==17)
        this.vin = vin;
    }

    public boolean isManuasl() {
        return isManuasl;
    }

    public void setManuasl(boolean manuasl) {
        isManuasl = manuasl;
    }

    public boolean isTransport() {
        return isTransport;
    }

    public void setTransport(boolean transport) {
        isTransport = transport;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public short getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(short productionYear) {
        this.productionYear = productionYear;
    }
    public Vehicle(){
        vehicleCount++;

    }

    public Vehicle(String mark, String model, float maxSpeed) {
        vehicleCount++;
        setMark(mark);
        setModel(model);
        setMaxSpeed(maxSpeed);
    }
}
