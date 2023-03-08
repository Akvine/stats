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
