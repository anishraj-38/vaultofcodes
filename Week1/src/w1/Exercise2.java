package w1;

public class Exercise2 {
    private String make;
    private String model;

    public Exercise2(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the car.");
    }

    // Fix: Add stop() method
    public void stop() {
        System.out.println("Stopping the car.");
    }
}
class Main {
    public static void main(String[] args) {
        Exercise2 car = new Exercise2("Toyota", "Camry");
        car.start();
        car.stop();
    }
}
