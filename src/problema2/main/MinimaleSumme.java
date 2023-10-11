package problema2.main;

public class MinimaleSumme {
    MaximaleZahl max = new MaximaleZahl();

    public float minsumme(int[] zahlen){
        for (int i = 0; i < zahlen.length; i++){
            if(zahlen[i] < 0){
                System.out.println("Zahlen soll positiv sein");
                return 0;
            }
        }
        float maxim= max.maxzahl(zahlen);
        float sum = 0;
        for(int i = 0; i < zahlen.length; i++){
            sum = sum + zahlen[i];
        }
        sum = sum - maxim;
        return sum;
    }
}