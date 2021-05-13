package patterns.behavior.interpreter;

public class WifeContext {
    private IExpression nonTerminalExpression;
    public WifeContext(){
        nonTerminalExpression = new NonTerminalExpression("老婆", "吃肉,运动");
    }

    public void action(String info){
        boolean result = nonTerminalExpression.interpret(info);
        if (result){
            System.out.println(info + "：许可");
        }else{
            System.out.println(info + "：拒绝");
        }
    }
}
