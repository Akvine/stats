package core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Array")
class ArrayTest {

    @Test
    @DisplayName("Fill - case 1")
    void fill_case1() {
        int size = 9;
        int fillValue = 15;
        Array array = new Array(size).fill(fillValue);
        double[] actual = array.values();
        double[] expected = fillExpected(size, fillValue);

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Fill - case 2")
    void fill_case2() {
        int size = 5;
        int fillValue = 10;
        Array array = new Array(size).fill(fillValue);
        double[] actual = array.values();
        double[] expected = fillExpected(size, fillValue);

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Size")
    void size() {
        int size = 3;
        Array array = new Array(size);

        assertThat(array).isNotNull();
        assertThat(array.size()).isEqualTo(size);
    }

    @Test
    @DisplayName("Length")
    void length() {
        int size = 5;
        Array array = new Array(size);

        assertThat(array).isNotNull();
        assertThat(array.length()).isEqualTo(size);
    }

    private double[] fillExpected(int size, double value) {
        double[] expected = new double[size];
        for (int i = 0; i < size; ++i) {
            expected[i] = value;
        }
        return expected;
    }
}