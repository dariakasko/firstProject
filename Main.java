import packWithClassCar.Car;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Smart", 200);
        car1.setCarColor("Yellow");

        System.out.println(car1.getCarColor());
        System.out.println(car1.getCarMarka());
        System.out.println(car1.getMaxSpeed());
    }
}