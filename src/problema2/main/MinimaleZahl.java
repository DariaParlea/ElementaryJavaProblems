package problema2.main;

public class MinimaleZahl {
    public float minzahl(int[] zahlen){
        for (int i = 0; i < zahlen.length; i++){
            if(zahlen[i] < 0){
                System.out.println("Zahlen soll positiv sein");
                return 0;
            }
        }
        float minim = Integer.MAX_VALUE;
        for (int i = 0; i < zahlen.length; i++)
            if (zahlen[i] < minim)
                minim = zahlen[i];

        return minim;
    }
}