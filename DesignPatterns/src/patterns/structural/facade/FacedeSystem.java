package patterns.structural.facade;

public class FacedeSystem {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();

    public void operation(){
        a.operationA();
        b.operationB();
    }
}
