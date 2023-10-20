package problema1.tests;
import problema1.main.MaximalRoundNote;
import org.junit.jupiter.api.Test;

class MaximalRoundNoteTest{
    @Test
    public void testMaximaleAbgerundeteNote_expected() {
        MaximalRoundNote prozessor = new MaximalRoundNote();
        int[] input = {75, 60, 85, 90, 40};
        int expectedOutput = 90;
        int result = prozessor.maximaleAbgerundeteNote(input);

        assert expectedOutput == result : "testMaximaleAbgerundeteNote_expected - Failed";
    }

    @Test
    public void testMaximaleAbgerundeteNote_unexpected() {
        MaximalRoundNote prozessor = new MaximalRoundNote();
        int[] input = {75, 60, 105, -10, 40};
        int expectedOutput = 105;
        int result = prozessor.maximaleAbgerundeteNote(input);

        //assert expectedOutput == result : "testMaximaleAbgerundeteNote_unexpected - Failed";
    }
}