package patterns.structural.bridge;

public class Car extends AbstractCar{

    @Override
    public void show() {
        System.out.println("This car is drive by "+this.driveMode.getDriveMode());
    }
}
