package com.xpagesbeast.tools.converter;

import com.xpagesbeast.tools.converter.model.FeetInchesFraction;

public class TankConversionsImpl implements TankConversions {

    public FeetInchesFraction convertDecimalFeetToFeetInchesFraction(double decimalFeet) {
        FeetInchesFraction answer = new FeetInchesFraction();
        if(decimalFeet > 0.0000000000001){
            long feet = (long) decimalFeet;
            long inches = (int)((decimalFeet - feet)*12);
            double fraction = ((decimalFeet - feet)*12)-inches;
            int numerator = (int) Math.round(fraction *16);
            int denominator = 0;

            if(numerator % 2 == 0){
                switch(numerator){
                    case 2: numerator = 1; denominator = 8;
                    break;
                    case 4: numerator = 1; denominator = 4;
                    break;
                    case 6: numerator = 3; denominator = 8;
                    break;
                    case 8: numerator = 1; denominator = 2;
                    break;
                    case 10: numerator = 5; denominator = 8;
                    break;
                    case 12: numerator = 3; denominator = 4;
                    break;
                    case 14: numerator = 7; denominator = 8;
                    break;
                    case 16: numerator = 0; denominator = 0; inches++;
                    break;
                }
            }else{
                denominator = 16;
            }
            answer.setFractionOfInch(numerator + "/" + denominator);
            answer.setDenominatorFraction(denominator);
            answer.setNumeratorFraction(numerator);
            answer.setFeet(feet);
            answer.setInches(inches);
        }
        return answer;
    }
}
