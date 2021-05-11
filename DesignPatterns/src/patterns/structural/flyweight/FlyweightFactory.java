package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IFlyweight> chessMap = new HashMap<>();
    public FlyweightFactory(){
        chessMap.put("W", new ConcreteFlyweightA());
        chessMap.put("B", new ConcreteFlyweightB());
    }

    public IFlyweight getChess(String key){
        return chessMap.get(key.toUpperCase());
    }
}
