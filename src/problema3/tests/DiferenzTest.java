package problema3.tests;
import problema3.main.Diferenz;
public class DiferenzTest {
    Diferenz dif = new Diferenz();

    public void test_substraction_expected(){
        int[] num1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] num2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedDifference = {2, 9, 0, 0, 0, 0, 0, 0, 0};

        int[] result = dif.substract_numbers(num1, num2);
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedDifference[i] : "Subtraction test failed!";
        }
    }

    public void test_substraction_unexpected(){
            int[] num1 = {1, 2, 3, 4};
            int[] num2 = {5, 6, 7, 8};
            int[] expectedDifference = {0, 0, 0, 0};

            int[] result = dif.substract_numbers(num1, num2);
            for (int i = 0; i < result.length; i++) {
                assert result[i] == expectedDifference[i] : "Unexpected subtraction test failed!";
            }
    }
}
