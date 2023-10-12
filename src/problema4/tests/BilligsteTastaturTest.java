package problema4.tests;
import problema4.main.BilligsteTastatur;
public class BilligsteTastaturTest {
    BilligsteTastatur bt = new BilligsteTastatur();

    public void testBilligsteTastatur_expected() {
        int[] options = {40, 50, 60, 30};
        int expectedMinimumPrice = 30;

        int result = bt.billigsteTastatur(options);
        assert result == expectedMinimumPrice : "testBilligsteTastatur_expected test failed!";
    }

    public void testBilligsteTastatur_unexpected() {
        int[] options = {70, 80, 90, 100};
        int expectedMinimumPrice = Integer.MAX_VALUE;

        int result = bt.billigsteTastatur(options);
        assert result == expectedMinimumPrice : "testBilligsteTastatur_unexpected test failed!";
    }

}
