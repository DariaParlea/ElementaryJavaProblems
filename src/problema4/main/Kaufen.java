package problema4.main;

public class Kaufen {
    public int money_spent(int budget, int[] keyboards, int[] usb){
        int maxMoneySpent = -1;

        for(int i=0; i< keyboards.length; i++) {
            for (int j = 0; j < usb.length; j++) {
                int totalCost = keyboards[i] + usb[j];
                if(totalCost <= budget && totalCost > maxMoneySpent)
                    maxMoneySpent = totalCost;
            }
        }

        return maxMoneySpent;

    }
}
