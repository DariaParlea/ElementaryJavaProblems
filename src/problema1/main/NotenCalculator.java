package problema1.main;
import static problema1.main.NotenProzessor.*;
public class NotenCalculator{
    public float durchschnittswert(int[] note){
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return 0;
            }
        }

        float durch_wert;
        int sum = 0;

        for(int i = 0; i < note.length; i++){
            sum = sum + round(note[i]);
        }

        durch_wert = sum/note.length;
        return durch_wert;
    }

}