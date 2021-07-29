package easy;

public class Offer29PrintArray {
    public int[] spiralOrder(int[][] matrix) {
        if(null == matrix || 0 == matrix.length){
            return new int[0];
        }
        int[] result = new int[matrix.length * matrix[0].length];
        int index=0;
        int left = 0; int right =  matrix[0].length -1; int top = 0; int bottom = matrix.length-1;
        while (true){
            if(left > right){
                break;
            }
            for(int i=left; i<= right; i++){
                result[index++] = matrix[top][i];
            }
            if(++top > bottom){
                break;
            }

            for(int i=top; i<= bottom; i++){
                result[index++] = matrix[i][right];
            }
            if(--right<left){
                break;
            }

            for(int i=right; i>=left ; i--){
                result[index++] = matrix[bottom][i];
            }
            if(--bottom<top){
                break;
            }

            for(int i=bottom; i>=top; i--){
                result[index++] = matrix[i][left];
            }
            if(++left > right){
                break;
            }
        }
        return result;
    }
}
