package problema1.tests;

public class TestRunner {
    public static void main(String[] args) {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();
        NotenCalculatorTest notenCalculatorTest = new NotenCalculatorTest();
        NotenRounderTest notenRounderTest = new NotenRounderTest();
        MaximalRoundNoteTest maximalRoundNoteTest = new MaximalRoundNoteTest();

        notenProzessorTest.addToArrayTest();
        notenProzessorTest.testNichtAusreichendeNoten_expected();
        notenProzessorTest.testNichtAusreichendeNoten_unexpected();
        notenCalculatorTest.testDurchschnittswert_expected();
        notenCalculatorTest.testDurchschnittswert_unexpected();
        notenRounderTest.testAbgerundeteNote_expected();
        notenRounderTest.testAbgerundeteNote_unexpected();
        maximalRoundNoteTest.testMaximaleAbgerundeteNote_expected();
        maximalRoundNoteTest.testMaximaleAbgerundeteNote_unexpected();
    }
}