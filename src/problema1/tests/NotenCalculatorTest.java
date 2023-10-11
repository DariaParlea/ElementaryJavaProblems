package problema1.tests;

import problema1.main.NotenCalculator;

class NotenCalculatorTest{
    public  void testDurchschnittswert_expected() {
        NotenCalculator prozessor = new NotenCalculator();
        int[] input = {75, 60, 85, 90, 40};
        float expectedOutput = 70.0f;
        float result = prozessor.durchschnittswert(input);

        assert expectedOutput == result : "testDurchschnittswert_expected - Failed";
    }

    public  void testDurchschnittswert_unexpected() {
        NotenCalculator prozessor = new NotenCalculator();
        int[] input = {75, 60, 105, -10, 40};
        float expectedOutput = 0.0f;
        float result = prozessor.durchschnittswert(input);

        assert expectedOutput == result : "testDurchschnittswert_unexpected - Failed";
    }
}