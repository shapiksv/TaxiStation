package Cars;

import CarClasses.CombinedCarBody;

public class UtilitVehicle extends AutoTransport {
    private CombinedCarBody combinedCarBody;
    private  int carryingCapacity;

    public UtilitVehicle(String mark, String model, double fuelConsumption, int cost, int speed , int carryingCapacity,CombinedCarBody combinedCarBody) {
        super(mark, model, fuelConsumption, cost, speed);
        this.carryingCapacity = carryingCapacity;
        this.combinedCarBody = combinedCarBody;
    }


    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public CombinedCarBody getCombinedCarBody() {
        return combinedCarBody;
    }

    public void setCombinedCarBody(CombinedCarBody combinedCarBody) {
        this.combinedCarBody = combinedCarBody;
    }

    @Override
    public String toString() {
        return "UtilitVehicle{" + super.toString().replace( "",
                "combinedCarBody=" + combinedCarBody +
                ", carryingCapacity=" + carryingCapacity +
                '}');
    }
}
