package problema2.tests;
import problema2.main.MinimaleZahl;
import org.junit.jupiter.api.Test;
public class MinimaleZahlTest {
    @Test
    public void testMinimaleZahl_expected() {
        MinimaleZahl minzahl = new MinimaleZahl();
        int[] input = {5, 10, 3, 8, 7};
        float expectedOutput = 3.0f;
        float result = minzahl.minzahl(input);

        assert expectedOutput == result : "testMinimalZahl_expected - Failed";
    }

    @Test
    public void testMinimaleZahl_unexpected() {
        MinimaleZahl minzahl = new MinimaleZahl();
        int[] input = {5, -10, 3, 8, -7};
        float expectedOutput = 0.0f;
        float result = minzahl.minzahl(input);

        assert expectedOutput == result : "testMinimalZahl_unexpected - Failed";
    }
}
