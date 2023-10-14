import java.util.Scanner;

//my student's book #1317
public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter number of rows: ");
            int rows = scan.nextInt();
            System.out.print("Enter number of colums: ");
            int cols = scan.nextInt();

            MatrixFill matrixFill = new MatrixFill();

            Byte[][] matrixA = matrixFill.generateRandomMatrix(rows, cols);
            Byte[][] matrixB = matrixFill.generateRandomMatrix(rows, cols);
            Integer[][] matrixC = new Integer[rows][cols];

            System.out.println("Matrix A:");
            printMatrix(matrixA);

            System.out.println("\nMatrix B:");
            printMatrix(matrixB);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            System.out.println("\nMatrix C = A + B:");
            printMatrix(matrixC);

            for (int i = 0; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < cols; j++) {
                    rowSum += matrixC[i][j];
                }
                double average = (double) rowSum / cols;
                String result = String.format("%.3f", average);
                System.out.println("Average of elements in row " + (i + 1) + ": " + result);
            }

        } catch (Exception e) {
            System.out.println("ERROR. Invalid input type.");
        }
    }
    public static <T> void printMatrix(T[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}