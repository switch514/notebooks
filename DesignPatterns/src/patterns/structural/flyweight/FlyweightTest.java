package patterns.structural.flyweight;

public class FlyweightTest {
    public static void main(String [] args){
        FlyweightFactory factory = new FlyweightFactory();
        UnsharedState state = new UnsharedState("X1Y2");
        factory.getChess("W").operation(state);
        state.setInfo("X3Y1");
        factory.getChess("b").operation(state);
    }
}
