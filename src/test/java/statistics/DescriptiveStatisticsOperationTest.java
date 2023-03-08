package statistics;

import core.Array;
import core.Round;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("DescriptiveStatisticsOperation")
class DescriptiveStatisticsOperationTest {

    @Test
    @DisplayName("Mean")
    void mean() {
        double[] values = {1.5, 3.1, -4.1, 8.32, 0.834};
        double expected = 1.9308;
        Array array = new Array(values);
        DescriptiveStatisticsOperation dos = new DescriptiveStatisticsOperation(array);
        double actual = dos.mean();

        assertThat(array).isNotNull();
        assertThat(dos).isNotNull();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Var (not biased)")
    void var_notBiased() {
        double[] values = {1.5, 3.1, -4.1, 8.32, 0.834};
        double expected = 19.987;

        Array array = new Array(values);
        DescriptiveStatisticsOperation dos = new DescriptiveStatisticsOperation(array);
        Round round = new Round();
        double actual = round.round(dos.var(), 3);

        assertThat(array).isNotNull();
        assertThat(dos).isNotNull();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Var (not biased)")
    void var_biased() {
        double[] values = {1.5, 3.1, -4.1, 8.32, 0.834};
        double expected = 15.9896;

        Array array = new Array(values);
        DescriptiveStatisticsOperation dos = new DescriptiveStatisticsOperation(array);
        Round round = new Round();
        double actual = round.round(dos.var(true), 4);

        assertThat(array).isNotNull();
        assertThat(dos).isNotNull();

        assertThat(actual).isEqualTo(expected);
    }
}