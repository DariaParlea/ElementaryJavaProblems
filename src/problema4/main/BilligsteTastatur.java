package problema4.main;

public class BilligsteTastatur {
    public int billigsteTastatur(int[] options){
        int minim = Integer.MAX_VALUE;
        for (int i = 0; i < options.length; i++)
            if (options[i] < minim)
                minim = options[i];

        return minim;

    }
}
