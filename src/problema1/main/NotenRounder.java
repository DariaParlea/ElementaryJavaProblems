package problema1.main;

import static problema1.main.NotenProzessor.*;

public class NotenRounder {
    public int[] abgerundeteNote(int[] note){
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return new int[0];
            }
        }

        int[] abgerundeteNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            abgerundeteNoten = addToArray(abgerundeteNoten, round(note[i]));
        }
        return abgerundeteNoten;
    }
}