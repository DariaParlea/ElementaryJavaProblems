package problema3.tests;
public class TestRunner {
    public static void main(String[] args){
        SummeTest sum = new SummeTest();
        DiferenzTest dif = new DiferenzTest();
        MultiplikationTest mul = new MultiplikationTest();
        DivisionTest div = new DivisionTest();

        sum.test_addition_expected();
        //sum.test_addition_unexpected();
        dif.test_substraction_expected();
        //dif.test_substraction_unexpected();
        mul.test_multiply_number_expected();
        //mul.test_multiply_number_unexpected();
        div.test_divide_number_expected();
        //div.test_divide_number_unexpected();
    }
}
