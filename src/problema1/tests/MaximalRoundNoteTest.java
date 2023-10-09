package problema1.tests;
import problema1.main.MaximalRoundNote;

class MaximalRoundNoteTest{
    public void testMaximaleAbgerundeteNote() {
        MaximalRoundNote prozessor = new MaximalRoundNote();
        int[] input = {75, 60, 85, 90, 40};
        int expectedOutput = 90;
        int result = prozessor.maximaleAbgerundeteNote(input);

        assert expectedOutput == result : "testMaximaleAbgerundeteNote - Failed";
    }
}