package problema1.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotenProzessor notenProzessor = new NotenProzessor();
        NotenCalculator notenCalculator = new NotenCalculator();
        NotenRounder notenRounder = new NotenRounder();
        MaximalRoundNote maximalRoundNote = new MaximalRoundNote();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };

        System.out.println(Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));
        System.out.println(notenCalculator.durchschnittswert(noten));
        System.out.println(Arrays.toString(notenRounder.abgerundeteNote(noten)));
        System.out.println(maximalRoundNote.maximaleAbgerundeteNote(noten));

    }
}