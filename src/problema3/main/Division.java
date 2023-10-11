package problema3.main;

public class Division {
    public int[] divide_number(int[] num, int digit){
        if (digit == 0) {
            System.out.println("Division by zero is not allowed.");
            return null;
        }
        int n = num.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = 0; i < n; i++) {
            int dividend = num[i] + carry * 10;
            result[i] = dividend / digit;
            carry = dividend % digit;
        }

        return result;
    }
}
