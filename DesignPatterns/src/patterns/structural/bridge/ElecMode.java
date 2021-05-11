package patterns.structural.bridge;

public class ElecMode implements IDriveModeImplementor {
    @Override
    public String getDriveMode() {
        return "Electronic";
    }
}
