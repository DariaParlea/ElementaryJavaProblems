package problema3.main;

public class Diferenz {
    public int[] substract_numbers(int[] num1, int[] num2){

        int n = num1.length;
        int[] result = new int[n];
        int borrow = 0;

        if(num1.length != num2.length){
            System.out.println("Zahlen soll die gleiche Anzahl an Ziffern haben.");
            return result;
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1[i];
            int digit2 = num2[i];
            int difference = digit1 - digit2 - borrow;

            if (difference < 0) {
                borrow = 1;
                difference += 10;
            } else {
                borrow = 0;
            }

            result[i] = difference;
        }

        return result;
    }
}
