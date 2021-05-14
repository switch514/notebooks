package patterns.behavior.vistor;

public class EManager implements IElement{
    private String name;
    private String otTime;
    private String profit;

    public EManager(String name, String otTime, String profit) {
        this.name = name;
        this.otTime = otTime;
        this.profit = profit;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitMember(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtTime() {
        return otTime;
    }

    public void setOtTime(String otTime) {
        this.otTime = otTime;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }
}
