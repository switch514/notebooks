package patterns.behavior.template;

public abstract class Template {
    public void method(){
        function1();
        function2();
        function3();
    }

    public void function1(){
        System.out.println("Template method");
    }

    public abstract  void function2();
    public abstract  void function3();
}
