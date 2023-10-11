package problema2.tests;
public class TestRunner {
    public static void main(String[] args){
        MaximaleZahlTest maximaleZahlTest = new MaximaleZahlTest();
        MaximaleSummeTest maximaleSummeTest = new MaximaleSummeTest();
        MinimaleZahlTest minimaleZahlTest = new MinimaleZahlTest();
        MinimaleSummeTest minimaleSummeTest = new MinimaleSummeTest();

        maximaleZahlTest.testMaximaleZahl_expected();
        maximaleZahlTest.testMaximaleZahl_unexpected();
        maximaleSummeTest.testMaximalSumme_expected();
        maximaleSummeTest.testMaximalSumme_unexpected();
        minimaleSummeTest.testMinimalSumme_expected();
        minimaleSummeTest.testMinimalSumme_unexpected();
        minimaleZahlTest.testMinimaleZahl_expected();
        minimaleZahlTest.testMinimaleZahl_unexpected();
    }
}
