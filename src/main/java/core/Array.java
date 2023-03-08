package core;

import java.util.Arrays;

public class Array {
    private final int size;
    private final double[] array;

    public Array(int size) {
        if (size < 0) {
            throw new RuntimeException("Size is less than 0");
        }

        this.size = size;
        this.array = new double[size];
    }

    public Array() {
        this(1);
    }

    public Array(int size, double value) {
        this(size);
        Arrays.fill(array, value);
    }

    public Array(double[] array) {
        this.size = array.length;
        this.array = Arrays.copyOf(array, size);
    }

    public Array fill(double value) {
        return new Array(size, value);
    }

    public int size() {
        return size;
    }

    public int length() {
        return size;
    }

    public double[] values() {
        return copy();
    }

    public Array plus(double value) {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] += value;
        }
        return new Array(values);
    }

    public Array minus(double value) {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] -= value;
        }
        return new Array(values);
    }

    public Array multiply(double value) {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] *= value;
        }
        return new Array(values);
    }

    public Array divide(double value) {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] /= value;
        }
        return new Array(values);
    }

    public Array pow(double value) {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.pow(values[i], value);
        }
        return new Array(values);
    }

    public Array sqrt() {
        return pow(0.5);
    }

    public Array reverse() {
        double[] values = new double[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            values[k] = array[i];
            k++;
        }
        return new Array(values);
    }

    public Array abs() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.abs(values[i]);
        }
        return new Array(values);
    }

    public Array negative() {
        return multiply(-1);
    }

    public Array round(int accuracy) {
        if (accuracy < 0) {
            throw new RuntimeException("Accuracy is less than 0");
        }

        double[] values = copy();
        double coeff = Math.pow(10, accuracy);

        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.round(values[i] * coeff) / coeff;
        }

        return new Array(values);
    }

    public Array sin() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.sin(values[i]);
        }
        return new Array(values);
    }

    public Array cos() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.cos(values[i]);
        }
        return new Array(values);
    }

    public Array tan() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.tan(values[i]);
        }
        return new Array(values);
    }

    public Array sinh() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.sinh(values[i]);
        }
        return new Array(values);
    }

    public Array cosh() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.cosh(values[i]);
        }
        return new Array(values);
    }

    public Array tanh() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.tanh(values[i]);
        }
        return new Array(values);
    }

    public Array acos() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.acos(values[i]);
        }
        return new Array(values);
    }

    public Array asin() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.asin(values[i]);
        }
        return new Array(values);
    }

    public Array atan() {
        double[] values = copy();
        for (int i = 0; i < values.length; ++i) {
            values[i] = Math.atan(values[i]);
        }
        return new Array(values);
    }


    private double[] copy() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public String toString() {
        return "Array{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
