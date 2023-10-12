package problema4.main;

public class USBkaufen {
    public int teuersteUSBkaufen(int[] preise, int budget){
        int maxim_u = -1;
        for (int i = 0; i < preise.length; i++)
            if (preise[i] > maxim_u && preise[i] <= budget)
                maxim_u = preise[i];
        return maxim_u;
    }
}
