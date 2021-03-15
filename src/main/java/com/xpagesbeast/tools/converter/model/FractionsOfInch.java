package com.xpagesbeast.tools.converter.model;

public enum FractionsOfInch {
    ONE_EIGHT("1/8"),
    ONE_QUARTER("1/4"),
    THREE_EIGHT("3/8"),
    ONE_HALF("1/2"),
    FIVE_EIGHT("1/8"),
    THREE_QUARTER("3/4"),
    SEVEN_EIGHT("7/8");

    private final String text;

    /**
     *
     * @param text
     */
    FractionsOfInch(final String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
