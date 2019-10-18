package Cars;

import CarClasses.OpenCarBody;

public class SportCar extends AutoTransport {
    private OpenCarBody openCarBody  ;

    public SportCar(String mark, String model, double fuelConsumption, int cost, int speed,OpenCarBody openCarBody) {
        super(mark, model, fuelConsumption, cost, speed);
        this.openCarBody = openCarBody;

    }

    public OpenCarBody getOpenCarBody() {
        return openCarBody;
    }

    public void setOpenCarBody(OpenCarBody openCarBody) {
        this.openCarBody = openCarBody;
    }

    @Override
    public String toString() {
        return "SportCar{" + super.toString().replace("",
                "openCarBody=" + openCarBody +
                '}');
    }
}
