package problema3.tests;
import problema3.main.Division;
import org.junit.jupiter.api.Test;
public class DivisionTest {
    Division div = new Division();

    @Test
    public void test_divide_number_expected(){
        int[] num1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;
        int[] expectedQuotient = {1, 1, 8, 0, 0, 0, 0, 0, 0};

        int[] result = div.divide_number(num1, digit);
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedQuotient[i] : "Integer division test failed!";
        }
    }

    @Test
    public void test_divide_number_unexpected(){
        int[] num1 = {5, 6, 7, 8};
        int digit = 0;

        int[] result = div.divide_number(num1, digit);
        assert result == null : "Unexpected integer division test failed!";
    }
}
