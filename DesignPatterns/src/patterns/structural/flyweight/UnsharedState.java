package patterns.structural.flyweight;


public class UnsharedState {
    private String info;

    public  UnsharedState(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
