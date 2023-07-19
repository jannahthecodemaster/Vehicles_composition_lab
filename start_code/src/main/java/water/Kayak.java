package water;

import products.IProduct;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle{
    public String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct);
    }


    @Override
    public String getHullType() {
        return null;
    }

    @Override
    public String setHullType(String type) {
        return null;
    }
}
