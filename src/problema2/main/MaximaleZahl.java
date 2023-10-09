package problema2.main;

public class MaximaleZahl {
    public float maxzahl(int[] zahlen){
        for (int i = 0; i < zahlen.length; i++){
            if(zahlen[i] < 0){
                System.out.println("Zahlen soll positiv sein");
                return 0;
            }
        }
        float maxim = -1;
        for (int i = 0; i < zahlen.length; i++)
            if (zahlen[i] > maxim)
                maxim = zahlen[i];

        return maxim;
    }
}
