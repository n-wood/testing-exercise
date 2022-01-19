package com.nathan;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple currency converter App.
 */
public class AppTest {
    /**
     * Positive test
     */
    @Test
    public void positive()
    {
        String[] inputs = {"£1.00","£2","£0.99"};
        String[] outputs = {"$1.36","$2.72","$1.35"};
        assertAll("inputs",
         () -> assertEquals(outputs[0], App.currencyCoversion(inputs[0])),
         () -> assertEquals(outputs[1], App.currencyCoversion(inputs[1])),
         () -> assertEquals(outputs[2], App.currencyCoversion(inputs[2]))
     );
    }

    /**
     * Negative test
     */
    @Test
    public void negativeValidation()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(App.currencyCoversion(""));
          });
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(App.currencyCoversion("%2.99"));
          });  
        assertThrows(NumberFormatException.class, () -> {
            Integer.valueOf(App.currencyCoversion("£notanumber"));
          });
        }
}
