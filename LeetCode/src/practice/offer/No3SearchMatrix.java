package practice.offer;

public class No3SearchMatrix {
    public static int[][] matrix = new int[][]{
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
    };


    public static boolean searchMatrix(int[][] matrix, int target) {

        int x = 0;
        int y = matrix.length - 1;

        while (x < matrix[0].length && y >= 0) {
            if(matrix[y][x] == target){
                return true;
            }
            else if(matrix[y][x] > target){
                y--;
            }else{
                x++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(No3SearchMatrix.matrix,5));
        System.out.println(searchMatrix(No3SearchMatrix.matrix,20));
    }
}
