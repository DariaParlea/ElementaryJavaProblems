package problema2.tests;
import problema2.main.MinimaleZahl;
public class MinimaleZahlTest {
    public void testMinimaleZahl_expected() {
        MinimaleZahl minzahl = new MinimaleZahl();
        int[] input = {5, 10, 3, 8, 7};
        float expectedOutput = 3.0f;
        float result = minzahl.minzahl(input);

        assert expectedOutput == result : "testMinimalZahl_expected - Failed";
    }

    public void testMinimaleZahl_unexpected() {
        MinimaleZahl minzahl = new MinimaleZahl();
        int[] input = {5, -10, 3, 8, -7};
        float expectedOutput = 0.0f; // Negative numbers present, so the result should be 0
        float result = minzahl.minzahl(input);

        assert expectedOutput == result : "testMinimalZahl_unexpected - Failed";
    }
}
