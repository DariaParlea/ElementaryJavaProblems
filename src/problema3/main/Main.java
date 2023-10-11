package problema3.main;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Summe sum = new Summe();
        Diferenz dif = new Diferenz();
        Multiplikation mul = new Multiplikation();
        Division div = new Division();

        int[] num1 = new int[] {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[] {1, 1, 8, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(sum.add_numbers(num1,num2)));
        System.out.println(Arrays.toString(dif.substract_numbers(num1,num2)));
        System.out.println(Arrays.toString(mul.multiply_number(num2,2)));
        System.out.println(Arrays.toString(div.divide_number(num1,2)));


    }
}
