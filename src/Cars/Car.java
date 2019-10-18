package Cars;


import CarClasses.ClosedCarBody;

public class Car extends AutoTransport {
    private ClosedCarBody closedCarBody;
    public Car(String mark, String model, double fuelConsumption, int cost, int speed, ClosedCarBody closedCarBody ) {
        super(mark, model, fuelConsumption, cost, speed);
        this.closedCarBody = closedCarBody;

    }

    public ClosedCarBody getClosedCarBody() {
        return closedCarBody;
    }



    @Override
    public String toString() {
        return "Car{" + super.toString().replace( "",
                "closedCarBody=" + closedCarBody +
                '}');
    }
}
