package problema4.tests;
import problema4.main.TeuersteGegenstand;
import org.junit.jupiter.api.Test;
public class TeuersteGegenstandTest {
    TeuersteGegenstand tg = new TeuersteGegenstand();
    @Test
    public void testTeuersteGegenstand_expected() {
        int[] tastatur = {40, 50, 60};
        int[] usb = {8, 12};
        int expectedMaxPrice = 60;

        int result = tg.teuerstegegenstand(tastatur, usb);
        assert result == expectedMaxPrice : "testTeuersteGegenstand_expected test failed!";
    }

    @Test
    public void testTeuersteGegenstand_unexpected() {
        int[] tastatur = {40, 50, 60};
        int[] usb = {8, 12, 70};
        int expectedMaxPrice = 60;

        int result = tg.teuerstegegenstand(tastatur, usb);
        //assert result == expectedMaxPrice : "testTeuersteGegenstand_unexpected test failed!";
    }

}
