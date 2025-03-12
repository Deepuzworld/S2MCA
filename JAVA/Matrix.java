import java.util.Scanner;

public class Matrix {
    private int row;
    private int column;
    private int[][] array;

    public Matrix(int maxRows, int maxColumns) {
        this.array = new int[maxRows][maxColumns];
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter size of matrix (row count): ");
        this.row = sc.nextInt();
        System.out.println("Enter size of matrix (column count): ");
        this.column = sc.nextInt(); // Fixed typo here
        System.out.println("Enter matrix elements: ");

        for (int rc = 0; rc < this.row; rc++) { // Fixed loop condition
            for (int cc = 0; cc < this.column; cc++) { // Fixed loop variable
                this.array[rc][cc] = sc.nextInt();
            }
        }
    }

    public static Matrix sum(Matrix m1, Matrix m2) {
        if (m1.row != m2.row || m1.column != m2.column) {
            System.out.println("Addition not possible: matrices have different dimensions.");
            return null;
        }
        Matrix result = new Matrix(m1.row, m1.column);
        for (int rc = 0; rc < m1.row; rc++) {
            for (int cc = 0; cc < m1.column; cc++) { // Fixed loop condition
                result.array[rc][cc] = m1.array[rc][cc] + m2.array[rc][cc];
            }
        }
        return result;
    }

    public void displayMatrix() {
        for (int rc = 0; rc < this.row; rc++) {
            for (int cc = 0; cc < this.column; cc++) {
                System.out.print(this.array[rc][cc] + " "); // Changed to print for formatting
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input for the first matrix: ");
        Matrix first = new Matrix(10, 10);
        first.inputMatrix();
        
        System.out.println("Input for the second matrix: ");
        Matrix second = new Matrix(10, 10);
        second.inputMatrix();

        Matrix sumMatrix = sum(first, second);
        if (sumMatrix != null) {
            System.out.println("......SUM MATRIX......");
            sumMatrix.displayMatrix();
        }
        System.out.println("......END......."); // Moved inside the main method
    }
}
