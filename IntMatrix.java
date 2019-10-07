import java.util.ArrayList;

public class IntMatrix {
    private int rows;
    private int columns;
    private int[][] matrix;

    public IntMatrix(int row, int column) {
        this.rows = row;
        this.columns = column;
        this.matrix = new int[row][column];
    }

    public void setCellValue(int row, int column, int value) {
        matrix[row][column] = value;
    }

    public int numberOfRows() {
        return matrix.length;
    }

    public int numberOfColumns() {
        return matrix[0].length;
    }

    public int getsum() {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    public int getMultiplication() {
        int result = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                result = result * matrix[row][col];
            }
        }
        return result;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                list.add(matrix[row][col]);
            }
        }

        return list.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || o.getClass() != this.getClass())
            return false;
        IntMatrix myMatrix = (IntMatrix) o;
        if (myMatrix.numberOfRows() != this.numberOfRows() || myMatrix.numberOfColumns() != this.numberOfColumns())
            return false;
        int n = this.rows < myMatrix.rows ? this.rows : myMatrix.rows;
        int m = this.columns < myMatrix.columns ? this.columns : myMatrix.columns;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (this.matrix[row][col] != myMatrix.matrix[row][col])
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        IntMatrix testMatrix = new IntMatrix(2, 3);
        IntMatrix testMatrix1 = new IntMatrix(2, 3);

        testMatrix.setCellValue(0, 0, 1);
        testMatrix.setCellValue(0, 1, 2);
        testMatrix.setCellValue(0, 2, 3);
        testMatrix.setCellValue(1, 0, 4);
        testMatrix.setCellValue(1, 1, 5);
        testMatrix.setCellValue(1, 2, 6);

        testMatrix1.setCellValue(0, 0, 1);
        testMatrix1.setCellValue(0, 1, 2);
        testMatrix1.setCellValue(0, 2, 3);
        testMatrix1.setCellValue(1, 0, 4);
        testMatrix1.setCellValue(1, 1, 5);
        testMatrix1.setCellValue(1, 2, 6);

        // testMatrix1.setCellValue(0, 0, 1);
        // testMatrix1.setCellValue(0, 1, 2);
        // testMatrix1.setCellValue(1, 0, 3);
        // testMatrix1.setCellValue(1, 1, 4);
        // testMatrix1.setCellValue(2, 0, 5);
        // testMatrix1.setCellValue(2, 1, 6);

        System.out.println("Matrix : " + testMatrix.toString());
        System.out.println("No. of Rows for matrix : " + testMatrix.numberOfRows());
        System.out.println("No. of Columns for matrix : " + testMatrix.numberOfColumns());
        System.out.println("sum of all elements within matrix is : " + testMatrix.getsum());
        System.out.println("multiplication of all elements within matrix is : " + testMatrix.getMultiplication());

        System.out.println("Matrix 1 : " + testMatrix1.toString());
        System.out.println("No. of Rows for matrix 1 : " + testMatrix1.numberOfRows());
        System.out.println("No. of Columns for matrix 1 : " + testMatrix1.numberOfColumns());
        System.out.println("sum of all elements within matrix 1 is : " + testMatrix1.getsum());
        System.out.println("multiplication of all elements within matrix 1 is : " + testMatrix1.getMultiplication());

        System.out.println("Are both the matrix equal? " + testMatrix.equals(testMatrix1));
    }

}