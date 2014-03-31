package com.clean.code.srs;


public class StringCalculator {

    public Integer sum(String values) {
        if (values.equals("")) {
            return 0;
        }
        if (values.contains(",")) {
            Integer sum = 0;
            for (String value : values.split(",")) {
                sum += Integer.decode(value);
            }
            return sum;
        } else {
            return Integer.valueOf(values);
        }

    }

}
