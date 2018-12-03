
package electronics;


public class Tv extends Electronics {
    
    private String type;
    private int size;

    public Tv(String brand, double price, int guarantee, String type, int size) {
        super(brand, price, guarantee);
        this.type = type;
        this.size = size;
    }
    
    public String findPromotion()
    {
        if(type.equals("LCD") && price >500)
            return ("\nYou get a free toaster!\n");
        else if(type.equals("HD") && price >800)
            return ("\nYou get a free food processor!\n");
        else
            return ("\nNo promotion.\n");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nType : " + type + "\nSize : " + size + findPromotion();
    }
    
    
}
