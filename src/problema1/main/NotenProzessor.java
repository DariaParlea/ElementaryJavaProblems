package problema1.main;

public class NotenProzessor {

    public int[] nichtAusreichendeNoten(int[] note) {

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) < 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

//    public float durchschnittswert(int[] note){
//        for (int i = 0; i < note.length; i++) {
//            if (note[i] < 0 || note[i] > 100) {
//                System.out.println("Noten soll zwischen 0 und 100 sein.");
//                return 0;
//            }
//        }
//
//        float durch_wert;
//        int sum = 0;
//
//        for(int i = 0; i < note.length; i++){
//            sum = sum + round(note[i]);
//        }
//
//        durch_wert = sum/note.length;
//        return durch_wert;
//    }

//    public int[] abgerundeteNote(int[] note){
//        for (int i = 0; i < note.length; i++) {
//            if (note[i] < 0 || note[i] > 100) {
//                System.out.println("Noten soll zwischen 0 und 100 sein.");
//                return null;
//            }
//        }
//
//        int[] abgerundeteNoten = new int[0];
//
//        for (int i = 0; i < note.length; i++) {
//            abgerundeteNoten = addToArray(abgerundeteNoten, round(note[i]));
//        }
//        return abgerundeteNoten;
//    }

//    public int maximaleAbgerundeteNote(int[] note){
//        for (int i = 0; i < note.length; i++) {
//            if (note[i] < 0 || note[i] > 100) {
//                System.out.println("Noten soll zwischen 0 und 100 sein.");
//                return 0;
//            }
//        }
//
//        int maxim = 0;
//        for(int i = 0; i < note.length; i++){
//            if(round(note[i]) > maxim)
//                maxim = round(note[i]);
//        }
//        return maxim;
//    }
    public static int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public static int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

}