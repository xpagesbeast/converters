package com.xpagesbeast.tools.converter.model;

public class FeetInchesFraction {
    private long feet;
    private long inches;
    private String fractionOfInch;
    private int numeratorFraction;
    private int denominatorFraction;

    public long getFeet() {
        return feet;
    }

    public void setFeet(long feet) {
        this.feet = feet;
    }

    public long getInches() {
        return inches;
    }

    public void setInches(long inches) {
        this.inches = inches;
    }

    public String getFractionOfInch() {
        return fractionOfInch;
    }

    public void setFractionOfInch(String fractionOfInch) {
        this.fractionOfInch = fractionOfInch;
    }

    public int getNumeratorFraction() {
        return numeratorFraction;
    }

    public void setNumeratorFraction(int numeratorFraction) {
        this.numeratorFraction = numeratorFraction;
    }

    public int getDenominatorFraction() {
        return denominatorFraction;
    }

    public void setDenominatorFraction(int denominatorFraction) {
        this.denominatorFraction = denominatorFraction;
    }
}
