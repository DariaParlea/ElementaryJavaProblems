package problema3.main;

public class Summe {
    public int[] add_numbers(int[] num1, int[] num2){

        if(num1.length != num2.length){
            System.out.println("Zahlen soll die gleiche Anzahl an Ziffern haben.");
            return null;
        }

        int n = num1.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1 ; i >= 0; i--) {
            int digit1 = num1[i];
            int digit2 = num2[i];
            int sum = digit1 + digit2 + carry;

            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            result[i] = sum;
        }

        if (carry > 0) {
            int[] extendedResult = new int[n + 1];
            extendedResult[0] = carry;
            System.arraycopy(result, 0, extendedResult, 1, n);
            return extendedResult;
        }

        return result;
    }
}
