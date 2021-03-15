# converters
converters for volume , weight, and decimal feet to feet inches and fraction parts for liquid storage

# Usage
Add library to your application
Then instantiate a new converter
Then call the method passing in a decimal value.
See the junit test for an example usage.


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

