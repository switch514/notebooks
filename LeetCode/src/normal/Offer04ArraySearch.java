package normal;

public class Offer04ArraySearch {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(0== matrix.length){
            return false;
        }
        int x=matrix[0].length-1;
        int y = 0;
        while(x>=0 && y<matrix.length){
            if(matrix[y][x] == target){
                return true;
            }
            if(matrix[y][x] > target){
                x--;
            }else{
                y++;
            }
        }
        return false;
    }
}
