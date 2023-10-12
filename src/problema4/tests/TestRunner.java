package problema4.tests;

public class TestRunner {
    public static void main(String[] args){
        BilligsteTastaturTest billigsteTastaturTest = new BilligsteTastaturTest();
        KaufenTest kaufenTest = new KaufenTest();
        TeuersteGegenstandTest teuersteGegenstandTest = new TeuersteGegenstandTest();
        USBkaufenTest usbkaufenTest = new USBkaufenTest();

        billigsteTastaturTest.testBilligsteTastatur_expected();
        billigsteTastaturTest.testBilligsteTastatur_expected();
        kaufenTest.testMoneySpent_expected();
        kaufenTest.testMoneySpent_unexpected();
        teuersteGegenstandTest.testTeuersteGegenstand_expected();
        teuersteGegenstandTest.testTeuersteGegenstand_unexpected();
        usbkaufenTest.testTeuersteUSBkaufen_expected();
        usbkaufenTest.testTeuersteUSBkaufen_unexpected();
    }
}
