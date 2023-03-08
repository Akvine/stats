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

    @Test
    @DisplayName("Plus - case 1")
    void plus_case1() {
        int size = 5;
        Array array = new Array(size);
        double[] expected = fillExpected(size, 5);
        double[] actual = array.plus(5).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Plus - case 2")
    void plus_case2() {
        int size = 5;
        Array array = new Array(size, 7);
        double[] expected = fillExpected(size, 19);
        double[] actual = array.plus(12).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Minus - case 1")
    void minus_case1() {
        int size = 5;
        Array array = new Array(size);
        double[] expected = fillExpected(size, -5);
        double[] actual = array.minus(5).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Minus - case 2")
    void minus_case2() {
        int size = 5;
        Array array = new Array(size, 25.125);
        double[] expected = fillExpected(size, 10);
        double[] actual = array.minus(15.125).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Multiply - case 1")
    void multiply_case1() {
        int size = 5;
        Array array = new Array(size);
        double[] expected = fillExpected(size, 0);
        double[] actual = array.multiply(5).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Multiply - case 2")
    void multiply_case2() {
        int size = 5;
        Array array = new Array(size, 5);
        double[] expected = fillExpected(size, -25);
        double[] actual = array.multiply(-5).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Divide - case 1")
    void divide_case1() {
        int size = 5;
        Array array = new Array(size, 5);
        double[] expected = fillExpected(size, -1);
        double[] actual = array.divide(-5).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Divide - case 2")
    void divide_case2() {
        int size = 10;
        Array array = new Array(size, 8);
        double[] expected = fillExpected(size, -3.2);
        double[] actual = array.divide(-2.5).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Pow - case 1")
    void pow_case1() {
        double[] values = {1, 2, 3, 4, 5};
        double[] expected = {1, 4, 9, 16, 25};

        Array array = new Array(values);
        double[] actual = array.pow(2).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Pow - case 2")
    void pow_case2() {
        double[] values = {1, 2, 3, 4, 5};
        double[] expected = {1, 8, 27, 64, 125};

        Array array = new Array(values);
        double[] actual = array.pow(3).values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Sqrt - case 1")
    void sqrt_case1() {
        double[] values = {1, 4, 9, 16, 25};
        double[] expected = {1, 2, 3, 4, 5};

        Array array = new Array(values);
        double[] actual = array.sqrt().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Sqrt - case 2")
    void sqrt_case2() {
        double[] values = {1, 1, 9, 36, 0.25};
        double[] expected = {1, 1, 3, 6, 0.5};

        Array array = new Array(values);
        double[] actual = array.sqrt().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Reverse - case 1")
    void reverse_case1() {
        double[] values = {1, -2, 3, -4, 5};
        double[] expected = {5, -4, 3, -2, 1};

        Array array = new Array(values);
        double[] actual = array.reverse().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Reverse - case 2")
    void reverse_case2() {
        double[] values = {-3, 15, 2, 0, 1, -2, 3, -4, 5};
        double[] expected = {5, -4, 3, -2, 1, 0, 2, 15, -3};

        Array array = new Array(values);
        double[] actual = array.reverse().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Abs - case 1")
    void abs_case1() {
        double[] values = {-5, 3, 1, -4, 2, 1};
        double[] expected = {5, 3, 1, 4, 2, 1};

        Array array = new Array(values);
        double[] actual = array.abs().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Abs - case 2")
    void abs_case2() {
        double[] values = {5, 3, 1, 4, 2, 1};
        double[] expected = {5, 3, 1, 4, 2, 1};

        Array array = new Array(values);
        double[] actual = array.abs().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Negative - case 1")
    void negative_case1() {
        double[] values = {-5, 3, -1, 4, -2, 1};
        double[] expected = {5, -3, 1, -4, 2, -1};

        Array array = new Array(values);
        double[] actual = array.negative().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Negative - case 2")
    void negative_case2() {
        double[] values = {5, 3, 1, 4, 2, 1};
        double[] expected = {-5, -3, -1, -4, -2, -1};

        Array array = new Array(values);
        double[] actual = array.negative().values();

        assertThat(array).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    private double[] fillExpected(int size, double value) {
        double[] expected = new double[size];
        for (int i = 0; i < size; ++i) {
            expected[i] = value;
        }
        return expected;
    }
}