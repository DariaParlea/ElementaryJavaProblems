package problema2.main;

public class Main {
    public static void main(String[] args){
        MinimaleSumme minimaleSumme = new MinimaleSumme();
        MinimaleZahl minimaleZahl = new MinimaleZahl();
        MaximaleZahl maximaleZahl = new MaximaleZahl();
        MaximaleSumme maximaleSumme = new MaximaleSumme();

        int[] zahlen = new int[] {4,8,10,3,17};

        System.out.println(minimaleSumme.minsumme(zahlen));
        System.out.println(minimaleZahl.minzahl(zahlen));
        System.out.println(maximaleSumme.maxsumme(zahlen));
        System.out.println(maximaleZahl.maxzahl(zahlen));
    }
}