package problema4.main;

public class TeuersteGegenstand {
    public int teuerstegegenstand(int[] tastatur, int[] usb){
        int maxim_t = Integer.MIN_VALUE;
        for (int i = 0; i < tastatur.length; i++)
            if(tastatur[i]<0){
                System.out.println("Preis soll positiv sein");
                return -1;
            }
        for (int i = 0; i < usb.length; i++)
            if(usb[i]<0){
                System.out.println("Preis soll positiv sein");
                return -1;
            }
        for (int i = 0; i < tastatur.length; i++)
            if (tastatur[i] > maxim_t)
                maxim_t = tastatur[i];

        int maxim_u = Integer.MIN_VALUE;
        for (int i = 0; i < usb.length; i++)
            if (usb[i] > maxim_u)
                maxim_u = usb[i];

        if(maxim_u > maxim_t)
            return maxim_u;
        else
            return maxim_t;


    }
}
