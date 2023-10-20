package problema1.tests;

import problema1.main.NotenProzessor;
import org.junit.jupiter.api.Test;

class NotenProzessorTest {

    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    public void addToArrayTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30 };
        int newElement = 50;

        int[] result = notenProzessor.addToArray(noten, newElement);

        assert noten[0] == result[0] : SHOULD_BE_EQUAL;
        assert noten[2] == result[1] : SHOULD_BE_EQUAL;
        assert noten[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;

    }
    @Test
    public  void testNichtAusreichendeNoten_expected() {
        NotenProzessor prozessor = new NotenProzessor();
        int[] input = {75, 60, 35, 90, 40};
        int[] expectedOutput = {35};
        int[] result = prozessor.nichtAusreichendeNoten(input);

        assert arrayEquals(expectedOutput, result) : "testNichtAusreichendeNoten_expected - Failed";
    }

    @Test
    public void testNichtAusreichendeNoten_unexpected() {
        NotenProzessor prozessor = new NotenProzessor();
        int[] input = {75, 60, 105, -10, 40};
        int[] expectedOutput = new int[0];
        int[] result = prozessor.nichtAusreichendeNoten(input);

        assert arrayEquals(expectedOutput, result) : "estNichtAusreichendeNoten_uenexpected - Failed";
    }

    public static boolean arrayEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


}