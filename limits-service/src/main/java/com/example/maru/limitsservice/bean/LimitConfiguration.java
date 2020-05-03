package com.example.maru.limitsservice.bean;

public class LimitConfiguration {

    int minimum;
    int maximum;

    protected LimitConfiguration() {

    }

    public LimitConfiguration(int minimum, int maximum) {

        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
