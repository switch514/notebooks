package patterns.structural.bridge;

public class SolarMode implements IDriveModeImplementor {
    @Override
    public String getDriveMode() {
        return "Solar";
    }
}
