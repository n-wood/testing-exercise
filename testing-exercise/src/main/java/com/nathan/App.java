package com.nathan;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class App 
{
    private static final BigDecimal GBP_TO_USD = BigDecimal.valueOf(1.36);

    public static String currencyCoversion(String value)
    {

        if (value.trim().isEmpty() || !value.trim().startsWith("£")) {
            throw new IllegalArgumentException("invalid input " + value);
        } 

        BigDecimal result = new BigDecimal(value.trim().substring(1)).multiply(GBP_TO_USD)
            .setScale(2,RoundingMode.UP);

        return "$" + result;
    }
}
