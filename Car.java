package packWithClassCar;

public class Car {
    private String marka;
    private int maxSpeed;
    private String color;

    public String nameOfCar;

    public Car() {

    }
    public Car(String marka, int maxSpeed) {

        this.maxSpeed = maxSpeed;
        this.marka = marka;
    }
    public String getCarMarka() {
        return this.marka;
    }
    public void setCarMarka(String marka) {
        this.marka = marka;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed() {
        this.maxSpeed = maxSpeed;
    }

    public String getCarColor() {
        return this.color;
    }
    public void setCarColor(String color) {
        this.color = color;
    }


}
