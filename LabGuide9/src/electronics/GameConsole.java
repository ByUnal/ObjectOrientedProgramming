
package electronics;


public class GameConsole extends Electronics {
    
    private int hdd;
    private double usb;

    public GameConsole(int hdd, double usb, String brand, double price, int guarantee) {
        super(brand, price, guarantee);
        this.hdd = hdd;
        this.usb = usb;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nHdd : " + hdd + "\nUsb : " + usb;
    }
}
