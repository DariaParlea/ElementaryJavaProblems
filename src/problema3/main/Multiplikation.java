package problema3.main;

public class Multiplikation {
    public int[] multiply_number(int[] num, int digit){
        int n = num.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
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
