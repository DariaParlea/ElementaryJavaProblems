package problema1.tests;

import problema1.main.NotenCalculator;

class NotenCalculatorTest{
    public  void testDurchschnittswert() {
        NotenCalculator prozessor = new NotenCalculator();
        int[] input = {75, 60, 85, 90, 40};
        float expectedOutput = 70.0f;
        float result = prozessor.durchschnittswert(input);

        assert expectedOutput == result : "testDurchschnittswert - Failed";
    }
}