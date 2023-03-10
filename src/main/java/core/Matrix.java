package core;

import java.util.Arrays;

public class Matrix {
    private final int rowsCount;
    private final int columnsCount;
    private final double[][] values;

    public Matrix(int rowsCount, int columnsCount, double value) {
        this.rowsCount = rowsCount;
        this.columnsCount = columnsCount;
        this.values = new double[rowsCount][columnsCount];
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                this.values[i][j] = value;
            }
        }
    }

    public Matrix(int rowsCount, int columnsCount) {
        this.rowsCount = rowsCount;
        this.columnsCount = columnsCount;
        this.values = new double[rowsCount][columnsCount];
    }

    public Matrix(int size, double value) {
        this(size, size, value);
    }

    public Matrix(int size) {
        this(size, size);
    }

    public Matrix(double[][] values) {
        this.values = copy(values);
        this.rowsCount = values.length;
        this.columnsCount = values[0].length;
    }

    public Matrix fill(double value) {
        double[][] values = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                values[i][j] = value;
            }
        }

        return new Matrix(values);
    }

    public double[][] values() {
        return copy();
    }

    public int rowsCount() {
        return rowsCount;
    }

    public int columnsCount() {
        return columnsCount;
    }

    public Matrix plus(double value) {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] += value;
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix minus(double value) {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] -= value;
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix multiply(double value) {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] *= value;
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix divide(double value) {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] /= value;
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix pow(double value) {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.pow(copiedValues[i][j], value);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix sqrt() {
        return pow(0.5);
    }

    public Matrix negative() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] *= -1;
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix abs() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.abs(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix fillDiagonal() {
        return fillDiagonal(1);
    }

    public Matrix fillDiagonal(double value) {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
                copiedValues[i][i] = value;
        }
        return new Matrix(copiedValues);
    }

    public Matrix round(int accuracy) {
        double[][] copiedValues = copy();
        double coeff = Math.pow(10, accuracy);

        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.round(copiedValues[i][j] * coeff) / coeff;
            }
        }

        return new Matrix(copiedValues);
    }

    public Matrix sin() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.sin(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix cos() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.cos(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix tan() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.tan(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix sinh() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.sinh(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix cosh() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.cosh(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix tanh() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.tanh(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix acos() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.acos(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix asin() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.asin(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix atan() {
        double[][] copiedValues = copy();
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                copiedValues[i][j] = Math.atan(copiedValues[i][j]);
            }
        }
        return new Matrix(copiedValues);
    }

    public Matrix dot(double[][] secondMatrix) {
        return dot(new Matrix(secondMatrix));
    }

    public Matrix dot(Matrix secondMatrix) {
        double[][] firstMatrixValues = copy();
        double[][] secondMatrixValues = secondMatrix.values();

        int firstMatrixRowsCount = rowsCount;
        int firstMatrixColumnsCount = columnsCount;
        int secondMatrixColumnsCount = secondMatrixValues[0].length;

        double[][] result = new double[firstMatrixRowsCount][secondMatrixColumnsCount];

        for (int i = 0; i < firstMatrixRowsCount; i++) {
            for (int j = 0; j < secondMatrixColumnsCount; j++) {
                int sum = 0;
                for (int k = 0; k < firstMatrixColumnsCount; k++) {
                    sum += firstMatrixValues[i][k] * secondMatrixValues[k][j];
                }
                result[i][j] = sum;
            }
        }

        return new Matrix(result);
    }

    public double determinant() {

        int rows = values.length;
        int columns = values[0].length;

        if (rows != columns) {
            throw new IllegalArgumentException("Матрица должна быть квадратной");
        }

        if (rows == 1) {
            return values[0][0];
        }

        if (rows == 2) {
            return values[0][0] * values[1][1] - values[0][1] * values[1][0];
        }

        double det = 0;

        for (int j = 0; j < columns; j++) {
            double[][] subMatrix = new double[rows - 1][columns - 1];

            for (int i = 1; i < rows; i++) {
                for (int k = 0; k < columns - 1; k++) {
                    if (k < j) {
                        subMatrix[i - 1][k] = values[i][k];
                    } else {
                        subMatrix[i - 1][k] = values[i][k + 1];
                    }
                }
            }

            det += Math.pow(-1, j) * values[0][j] * new Matrix(subMatrix).determinant();
        }

        return det;
    }

    public Matrix transpose() {
        int numRows = values.length;
        int numCols = values[0].length;
        double[][] transposed = new double[numCols][numRows];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                transposed[i][j] = values[j][i];
            }
        }

        return new Matrix(transposed);
    }

    public Array toArray() {
        double[] arrayValues = new double[rowsCount * columnsCount];
        int k = 0;
        for (int i = 0; i < rowsCount; ++i) {
            for (int j = 0; j < columnsCount; ++j) {
                arrayValues[k] = values[i][j];
                k++;
            }
        }
        return new Array(arrayValues);
    }

    private double[][] copy() {
        return copy(values);
    }

    private double[][] copy(double[][] values) {
        int rowsCount = values.length;
        int columnsCount = values[0].length;
        double[][] copyValues = new double[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; ++i) {
            System.arraycopy(values[i], 0, copyValues[i], 0, columnsCount);
        }

        return copyValues;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "rowsCount=" + rowsCount +
                ", columnsCount=" + columnsCount +
                ", values=" + toStringValues() +
                '}';
    }

    private String toStringValues() {
        StringBuilder matrixValues = new StringBuilder("\n");
        for (double[] row : values) {
            matrixValues
                    .append(Arrays.toString(row))
                    .append("\n");
        }
        return matrixValues.toString();
    }
}
