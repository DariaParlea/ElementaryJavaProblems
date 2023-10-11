package problema2.tests;
import problema2.main.MaximaleZahl;

class MaximaleZahlTest{
    public void testMaximaleZahl_expected() {
        MaximaleZahl maxzahl = new MaximaleZahl();
        int[] input = {5, 10, 3, 8, 7};
        float expectedOutput = 10.0f;
        float result = maxzahl.maxzahl(input);

        assert expectedOutput == result : "testMaximaleZahl_expected - Failed";
    }

    public void testMaximaleZahl_unexpected() {
        MaximaleZahl maxzahl = new MaximaleZahl();
        int[] input = {5, -10, 3, 8, -7};
        float expectedOutput = 0.0f;
        float result = maxzahl.maxzahl(input);

        assert expectedOutput == result : "testMaximaleZahl_unexpected - Failed";
    }

}