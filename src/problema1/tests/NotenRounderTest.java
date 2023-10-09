package problema1.tests;
import problema1.main.NotenRounder;
import static problema1.tests.NotenProzessorTest.*;
class NotenRounderTest{
    public void testAbgerundeteNote() {
        NotenRounder prozessor = new NotenRounder();
        int[] input = {75, 60, 85, 90, 40};
        int[] expectedOutput = {75, 60, 85, 90, 40};
        int[] result = prozessor.abgerundeteNote(input);

        assert arrayEquals(expectedOutput, result) : "testAbgerundeteNote - Failed";
    }
}