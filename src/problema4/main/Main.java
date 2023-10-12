package problema4.main;

public class Main {
    public static void main(String[] args){
        BilligsteTastatur billigsteTastatur = new BilligsteTastatur();
        Kaufen kaufen = new Kaufen();
        TeuersteGegenstand teuersteGegenstand = new TeuersteGegenstand();
        USBkaufen usbkaufen = new USBkaufen();

        int[] keyboards = {15, 20, 10, 35};
        int[] usb = {20, 8, 29, 17};

        System.out.println(billigsteTastatur.billigsteTastatur(keyboards));
        System.out.println(teuersteGegenstand.teuerstegegenstand(keyboards, usb));
        System.out.println(usbkaufen.teuersteUSBkaufen(usb, 25));
        System.out.println(kaufen.money_spent(50, keyboards, usb));
    }
}
