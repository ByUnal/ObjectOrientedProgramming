
package electronics;

/**
 *
 * @author lenovo
 */
public class Electronics implements IElectronics {

    protected String brand;
    protected double price;
    protected int guarantee;

    public Electronics(String brand, double price, int guarantee) {
        this.brand = brand;
        this.price = price;
        this.guarantee = guarantee;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + "\nPrice : " + price + "\nGuarantee :" + guarantee;
    }

    @Override
    public String findpromotion() {
        return "\nYou get a free toaster";
    }
    
    
    
    
}
