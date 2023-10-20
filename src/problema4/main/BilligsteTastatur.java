package problema4.main;

public class BilligsteTastatur {
    public int billigsteTastatur(int[] options){
        int minim = Integer.MAX_VALUE;
        for (int i = 0; i < options.length; i++)
            if(options[i]<0){
                System.out.println("Preis soll positiv sein");
                return -1;
            }
        for (int i = 0; i < options.length; i++)
            if (options[i] < minim)
                minim = options[i];

        return minim;

    }
}
