package patterns.behavior.strategy;

public class StrategyContext {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
