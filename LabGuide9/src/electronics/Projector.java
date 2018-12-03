
package electronics;


public class Projector extends Electronics {
    
    private int ansilumen;
    private int lampHour;

    public Projector(int ansilumen, int lampHour, String brand, double price, int guarantee) {
        super(brand, price, guarantee);
        this.ansilumen = ansilumen;
        this.lampHour = lampHour;
    }

    @Override
    public String toString() {
        return super.toString() + "Ansilumen : " + ansilumen + "LampHour :" + lampHour;
    }
    
    
    
    
    
}
