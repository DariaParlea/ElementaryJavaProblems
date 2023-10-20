package problema2.tests;
import problema2.main.MinimaleSumme;
import org.junit.jupiter.api.Test;
public class MinimaleSummeTest {
    @Test
    public void testMinimalSumme_expected() {
        MinimaleSumme minsumme = new MinimaleSumme();
        int[] input = {5, 10, 3, 8, 7};
        float expectedOutput = 23.0f;
        float result = minsumme.minsumme(input);

        assert expectedOutput == result : "testMinimalSumme_expected - Failed";
    }

    @Test
    public void testMinimalSumme_unexpected() {
        MinimaleSumme minsumme = new MinimaleSumme();
        int[] input = {5, -10, 3, 8, -7};
        float expectedOutput = 0.0f;
        float result = minsumme.minsumme(input);

        assert expectedOutput == result : "testMinimalSumme_unexpected - Failed";
    }
}
