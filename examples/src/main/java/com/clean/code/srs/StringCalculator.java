package com.clean.code.srs;


public class StringCalculator {

    public Integer sum(String values) {
        if (areEmpty(values)) {
            return defaultValue();
        }
        if (isSingleValue(values)) {
            return singleNumericValue(values);
        }
        return sumValues(values);
    }

    private boolean areEmpty(String values) {
        return values.equals("");
    }

    private int defaultValue() {
        return 0;
    }

    private Integer singleNumericValue(String values) {
        return Integer.decode(values);
    }

    private boolean isSingleValue(String values) {
        return !values.contains(",");
    }

    private Integer sumValues(String values) {
        Integer sum = 0;
        for (String value : values.split(",")) {
            sum += Integer.decode(value);
        }
        return sum;
    }

}
