package com.xpagesbeast.tools.converter;

import com.xpagesbeast.tools.converter.model.FeetInchesFraction;
import com.xpagesbeast.tools.converter.model.FractionsOfInch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @link https://www.spikevm.com/calculators/decimal-feet.php
 */
class TankConversionsImplTest {

    @Test
    void convertDecimalFeetToFeetInchesFraction() {
        //setup
        TankConversionsImpl conversion = new TankConversionsImpl();
        double value = 22.657;

        //execution
        FeetInchesFraction answer = conversion.convertDecimalFeetToFeetInchesFraction(value);

        //validation
        assertEquals(answer.getFeet(),22);
        assertEquals(answer.getInches(),7);
        assertEquals(answer.getFractionOfInch(), FractionsOfInch.SEVEN_EIGHT.toString());
        assertEquals(answer.getNumeratorFraction(),7);
        assertEquals(answer.getDenominatorFraction(),8);
    }
}