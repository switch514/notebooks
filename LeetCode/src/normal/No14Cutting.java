package normal;

public class No14Cutting {
    public int cuttingRope(int n) {

        if(n<=3){
            return n-1;
        }
        int div = n/3;
        int add = n%3;
        if(0==add ){
            return (int) Math.pow(3,div);
        }else if( 1==add){
            return (int) Math.pow(3,div-1) *4;
        }
        else{
            return (int) Math.pow(3,div) * 2;
        }
    }
}
