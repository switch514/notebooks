package patterns.behavior.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements IExpression{
    private Set<String> keys = new HashSet<>();

    public TerminalExpression(String expression) {
        keys.addAll(Arrays.asList(expression.split(",", -1)));
    }

    @Override
    public boolean interpret(String info) {
        if(keys.contains(info)){
            return true;
        }
        return false;
    }
}
