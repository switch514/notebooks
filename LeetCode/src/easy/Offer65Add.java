package easy;

public class Offer65Add {
    public int add(int a, int b) {
        if(b==0){
            return a;
        }
        int carry = (a & b) <<1;
        int sum = a ^ b;
        return add(sum, carry);
    }
}
