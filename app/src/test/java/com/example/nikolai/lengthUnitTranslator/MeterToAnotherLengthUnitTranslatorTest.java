package com.example.nikolai.lengthUnitTranslator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MeterToAnotherLengthUnitTranslatorTest {
    private MeterToOtherLengthUnitTranslator translator = new MeterToOtherLengthUnitTranslator();

    @Test
    public void translateToCmTestWithValidValue() throws Exception {
        translator.setValue(100);
        Assert.assertEquals(10000.0, translator.meterToCm(), 0.0);

        translator.setValue(40);
        Assert.assertEquals(4000.0, translator.meterToCm(), 0.0);
    }

    @Test
    public  void translateToCmTestWithInvalidValue() {
        translator.setValue(-100);
        Assert.assertEquals(0, translator.meterToCm(), 0.0);
    }

    @Test
    public void translateToKmTestWithValidValue() throws Exception {
        translator.setValue(100);
        Assert.assertEquals(0.1, translator.meterToKm(), 0.0);

        translator.setValue(40);
        Assert.assertEquals(0.04, translator.meterToKm(), 0.0);
    }

    @Test
    public  void translateToKmTestWithInvalidValue() {
        translator.setValue(-100);
        Assert.assertEquals(0, translator.meterToKm(), 0.0);
    }

    @Test
    public void translateToFtTestWithValidValue() throws Exception {
        translator.setValue(100);
        Assert.assertEquals(328.08, translator.meterToFt(), 0.1);

        translator.setValue(40);
        Assert.assertEquals(131.232, translator.meterToFt(), 0.0);
    }

    @Test
    public  void translateToFtTestWithInvalidValue() {
        translator.setValue(-100);
        Assert.assertEquals(0, translator.meterToFt(), 0.0);
    }
}