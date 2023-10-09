package problema1.main;

import static problema1.main.NotenProzessor.*;

public class MaximalRoundNote {
    public int maximaleAbgerundeteNote(int[] note){
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return 0;
            }
        }

        int maxim = 0;
        for(int i = 0; i < note.length; i++){
            if(round(note[i]) > maxim)
                maxim = round(note[i]);
        }
        return maxim;
    }
}