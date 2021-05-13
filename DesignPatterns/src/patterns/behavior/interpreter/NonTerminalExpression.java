package patterns.behavior.interpreter;

public class NonTerminalExpression implements IExpression{
    private IExpression persons;
    private IExpression actions;

    public NonTerminalExpression(String persons, String actions) {
        this.persons = new TerminalExpression(persons);
        this.actions = new TerminalExpression(actions);
    }



    @Override
    public boolean interpret(String info) {
        if(info.contains("#")){
            String person = info.split("#")[0];
            String action = info.split("#")[1];
            return persons.interpret(person) && actions.interpret(action);
        }else{
            return false;
        }
    }
}
