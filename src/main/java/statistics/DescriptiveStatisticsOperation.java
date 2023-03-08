package statistics;

import core.Array;

import static java.lang.Math.pow;

public class DescriptiveStatisticsOperation {
    private final Array array;

    public DescriptiveStatisticsOperation(Array array) {
        this.array = array;
    }

    public DescriptiveStatisticsOperation(double[] array) {
        this(new Array(array));
    }

    public double mean() {
        double[] arrayValues = array.values();
        int arrayLength = array.length();
        double mean = 0;

        for (double value : arrayValues) {
            mean += value;
        }

        return mean / arrayLength;
    }

    public double var() {
        return var(false);
    }

    public double var(boolean biased) {
        double mean = mean();
        double var = 0;
        double[] arrayValues = array.values();
        int arrayLength = array.length();

        for (double value : arrayValues) {
            var += pow(value - mean, 2);
        }

        return biased ? var / arrayLength : var / (arrayLength - 1) ;
    }
}
