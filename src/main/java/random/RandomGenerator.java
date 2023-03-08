package random;

import core.Array;

import java.util.concurrent.ThreadLocalRandom;

public abstract class RandomGenerator {
    private static final int DEFAULT_MIN = 0;
    private static final int DEFAULT_MAX = 10;
    protected static final int DEFAULT_SIZE = 10;

    public Array randomInt() {
        return randomInt(DEFAULT_MIN, DEFAULT_MAX, DEFAULT_SIZE);
    }

    public Array randomInt(int min, int max) {
        return randomInt(min, max, DEFAULT_SIZE);
    }

    public Array randomInt(int min, int max, int size) {
        double[] values = new double[size];

        for (int i = 0; i < size; ++i) {
            values[i] = ThreadLocalRandom.current().nextInt(min, max);
        }

        return new Array(values);
    }

    public Array randomDouble() {
        return randomDouble(DEFAULT_MIN, DEFAULT_MAX, DEFAULT_SIZE);
    }

    public Array randomDouble(double min, double max) {
        return randomDouble(min, max, DEFAULT_SIZE);
    }

    public Array randomDouble(double min, double max, int size) {
        double[] values = new double[size];

        for (int i = 0; i < size; ++i) {
            values[i] = ThreadLocalRandom.current().nextDouble(min, max);
        }

        return new Array(values);
    }
}
