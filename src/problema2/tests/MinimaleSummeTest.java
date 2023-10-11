package problema2.tests;
import problema2.main.MinimaleSumme;
public class MinimaleSummeTest {
    public void testMinimalSumme_expected() {
        MinimaleSumme minsumme = new MinimaleSumme();
        int[] input = {5, 10, 3, 8, 7};
        float expectedOutput = 33.0f;
        float result = minsumme.minsumme(input);

        assert expectedOutput == result : "testMinimalSumme_expected - Failed";
    }

    public void testMinimalSumme_unexpected() {
        MinimaleSumme minsumme = new MinimaleSumme();
        int[] input = {5, -10, 3, 8, -7};
        float expectedOutput = 0.0f;
        float result = minsumme.minsumme(input);

        assert expectedOutput == result : "testMinimalSumme_unexpected - Failed";
    }
}
