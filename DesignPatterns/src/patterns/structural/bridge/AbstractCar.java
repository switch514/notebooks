package patterns.structural.bridge;

public abstract class AbstractCar {
    public IDriveModeImplementor driveMode;

    public void setDriveMode(IDriveModeImplementor driveMode) {
        this.driveMode = driveMode;
    }

    public abstract void show();
}
