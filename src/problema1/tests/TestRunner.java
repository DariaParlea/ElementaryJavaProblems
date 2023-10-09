package problema1.tests;

public class TestRunner {
    public static void main(String[] args) {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();
        NotenCalculatorTest notenCalculatorTest = new NotenCalculatorTest();
        NotenRounderTest notenRounderTest = new NotenRounderTest();
        MaximalRoundNoteTest maximalRoundNoteTest = new MaximalRoundNoteTest();

        notenProzessorTest.addToArrayTest();
        notenProzessorTest.testNichtAusreichendeNoten();
        notenCalculatorTest.testDurchschnittswert();
        notenRounderTest.testAbgerundeteNote();
        maximalRoundNoteTest.testMaximaleAbgerundeteNote();
    }
}