package normal;

public class Offer20IsNumber {
    public boolean isNumber(String s) {
        if(null ==s | s.length()==0 | s.matches("^\\s+$")){
            return false;
        }
        return s.trim().matches("^(\\+|\\-)?((\\d+)(\\.\\d+)?|(\\.\\d+)|(\\d+\\.))([E|e][\\+|\\-]?\\d+)?$");
    }
}
