package patterns.structural.bridge;

public class BridgeTest {
    public static void main(String [] args){
        Car car = new Car();
        car.setDriveMode(new ElecMode());
        car.show();

        car.setDriveMode(new GasolineMode());
        car.show();
    }
}
