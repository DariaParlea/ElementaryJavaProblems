package problema2.tests;
import problema2.main.MaximaleSumme;
import org.junit.jupiter.api.Test;

class MaximaleSummeTest{
    @Test
    public void testMaximalSumme_expected() {
        MaximaleSumme maxsumme = new MaximaleSumme();
        int[] input = {5, 10, 3, 8, 7};
        float expectedOutput = 30.0f;
        float result = maxsumme.maxsumme(input);

        assert expectedOutput == result : "testMaximalSumme_expected - Failed";
    }

    @Test
    public void testMaximalSumme_unexpected() {
        MaximaleSumme maxsumme = new MaximaleSumme();
        int[] input = {5, 10, -3, 8, -7};
        float expectedOutput = 0.0f;
        float result = maxsumme.maxsumme(input);

        assert expectedOutput == result : "testMaximalSumme_unexpected - Failed";
    }
}