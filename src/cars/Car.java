package cars;

import main.Running;

public class Car implements Running {
    private double speed;
    private String vendor;

    public Car(double speed, String vendor) {
        this.speed = speed;
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
