package water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {
private String hullType;
private IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct,String hullType, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = type;
    }

    @Override
    public void startEngine() {
        this.motor.startEngine();

    }

    @Override
    public void stopEngine() {
        this.motor.stopEngine();

    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
            this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }
}
