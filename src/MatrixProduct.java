import java.util.Arrays;
import java.util.Scanner;

public class MatrixProduct {
    static void printMatrix(int[][] matrix){
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }
    static int[][] matrixProduct(int[][] matrix, int k){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j]*=k;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        printMatrix(matrixProduct(matrix, k));
    }
}
