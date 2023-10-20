package problema3.tests;
import problema3.main.Multiplikation;
import org.junit.jupiter.api.Test;
public class MultiplikationTest {
    Multiplikation mul = new Multiplikation();

    @Test
    public void test_multiply_number_expected(){
        int[] num1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;
        int[] expectedProduct = {4, 7, 2, 0, 0, 0, 0, 0, 0};

        int[] result = mul.multiply_number(num1, digit);
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedProduct[i] : "Multiplication test failed!";
        }
    }

    @Test
    public void test_multiply_number_unexpected(){
        int[] num1 = {9, 9, 9, 9};
        int digit = 0;
        int[] expectedProduct = {0, 0, 0, 0};

        int[] result = mul.multiply_number(num1, digit);
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedProduct[i] : "Unexpected multiplication test failed!";
        }
    }
}
