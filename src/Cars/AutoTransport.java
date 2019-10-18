package Cars;

public class AutoTransport implements Comparable <AutoTransport>{
    private String mark;
    private String model;
    private double fuelConsumption;
    private int cost;
    private int speed;

    public AutoTransport(String mark, String model, double fuelConsumption, int cost, int speed) {
        this.mark = mark;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.speed = speed;
    }

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

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return                 "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                ", speed=" + speed
                ;
    }

    @Override
    public int compareTo(AutoTransport o) {
        return (int) (this.fuelConsumption - o.fuelConsumption);
    }
}
