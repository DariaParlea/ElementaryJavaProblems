package problema4.tests;
import problema4.main.Kaufen;
import org.junit.jupiter.api.Test;
public class KaufenTest {
    Kaufen k = new Kaufen();
    @Test
    public void testMoneySpent_expected() {
        int budget = 60;
        int[] keyboards = {40, 50, 60};
        int[] usb = {8, 12};
        int expectedMoneySpent = 58;

        int result = k.money_spent(budget, keyboards, usb);
        assert result == expectedMoneySpent : "testMoneySpent_expected test failed!";
    }

    @Test
    public void testMoneySpent_unexpected() {
        int budget = 30;
        int[] keyboards = {40, 50, 60};
        int[] usb = {8, 12};
        int expectedMoneySpent = -1;

        int result = k.money_spent(budget, keyboards, usb);
        assert result == expectedMoneySpent : "testMoneySpent_unexpected test failed!";
    }

}
