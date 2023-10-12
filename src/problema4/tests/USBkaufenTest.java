package problema4.tests;
import problema4.main.USBkaufen;
public class USBkaufenTest {
    USBkaufen uk = new USBkaufen();
    public void testTeuersteUSBkaufen_expected() {
        int[] preise = {8, 12, 15, 10};
        int budget = 20;
        int expectedMaxPrice = 15;

        int result = uk.teuersteUSBkaufen(preise, budget);
        assert result == expectedMaxPrice : "testTeuersteUSBkaufen_expected test failed!";
    }

    public void testTeuersteUSBkaufen_unexpected() {
        int[] preise = {25, 30, 35};
        int budget = 20;
        int expectedMaxPrice = -1;

        int result = uk.teuersteUSBkaufen(preise, budget);
        assert result == expectedMaxPrice : "testTeuersteUSBkaufen_unexpecte test failed!";
    }

}
