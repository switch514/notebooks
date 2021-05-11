package patterns.structural.bridge;

public class GasolineMode implements IDriveModeImplementor {
    @Override
    public String getDriveMode() {
        return "Gasoline";
    }
}
