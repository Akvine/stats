import core.Matrix;

public class Main {
    public static void main(String[] args) {
        double[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(values);
        System.out.println(matrix.transpose().transpose());
    }
}
