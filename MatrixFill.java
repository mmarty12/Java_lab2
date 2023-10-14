import java.util.Random;

public class MatrixFill {
    public Byte[][] generateRandomMatrix(int rows, int cols) {
        Byte[][] matrix = new Byte[rows][cols];
        Random random = new Random();

        // Fill the matrix with random byte values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                byte randomByte = (byte) random.nextInt(256); // generates a random byte value between 0 and 255
                matrix[i][j] = randomByte;
            }
        }
        return matrix;
    }
}
