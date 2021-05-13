package patterns.behavior.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        WifeContext context = new WifeContext();
        context.action("老婆#吃肉");
        context.action("老婆#喝奶茶");
        context.action("老公#吃肉");
        context.action("老婆#运动");
    }
}
