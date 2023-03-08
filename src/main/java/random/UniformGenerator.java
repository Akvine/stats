package random;

import core.Array;

public class UniformGenerator extends RandomGenerator {
    private static final int DEFAULT_MIN = 0;
    private static final int DEFAULT_MAX = 1;

    public Array randomUniform() {
        return randomUniform(DEFAULT_MIN, DEFAULT_MAX, DEFAULT_SIZE);
    }

    public Array randomUniform(double min, double max, int size) {
        return randomDouble(min, max, size);
    }
}
