package com.example.nikolai.lengthUnitTranslator;

/**
 * Created by nikolai on 6/23/17.
 */

public class MeterToOtherLengthUnitTranslator {
    private double value;

    MeterToOtherLengthUnitTranslator() {
        value = 0;
    }

    MeterToOtherLengthUnitTranslator(double value) {
        if (value >= 0)
            this.value = value;
        else {
            this.value = 0;
        }
    }

    public void setValue(double value) {
        if (value >= 0)
            this.value = value;
        else {
            this.value = 0;
        }
    }

    public double meterToCm() {
        return value * 100;
    }

    public double meterToKm() {
        return value / 1000;
    }

    public double meterToFt() {
        return value * 3.2808;
    }
}
