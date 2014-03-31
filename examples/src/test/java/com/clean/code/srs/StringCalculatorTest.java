package com.clean.code.srs;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringCalculatorTest {


    @Test
    public void returns_default_value_for_empty_string() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();

        Integer sum = stringCalculator.sum("");

        Assertions.assertThat(sum).isEqualTo(0);
    }

    @Test
    public void returns_numeric_value_for_single_value() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();

        Integer sum = stringCalculator.sum("5");

        Assertions.assertThat(sum).isEqualTo(5);
    }

    @Test
    public void returns_numeric_sum_of_values_for_list_of_values() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();

        Integer sum = stringCalculator.sum("1,2");

        Assertions.assertThat(sum).isEqualTo(3);
    }
}
