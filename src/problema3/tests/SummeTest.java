package problema3.tests;
import problema3.main.Summe;
import org.junit.jupiter.api.Test;
public class SummeTest {
    Summe sum = new Summe();
    @Test
    public void test_addition_expected(){
        int[] num1 = {1, 2, 3, 4};
        int[] num2 = {5, 6, 7, 8};
        int[] expectedSum = {6, 9, 1, 2};

        int[] result = sum.add_numbers(num1, num2);
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedSum[i] : "test_addition_expected failed!";
        }
    }

    @Test
    public void test_addition_unexpected(){
        int[] num1 = {9, 9, 9, 9};
        int[] num2 = {1};

        int[] result = sum.add_numbers(num1, num2);
        //assert result == null : "test_addition_unexpected failed!";

    }
}
