
package labguide4;


public class Luggage {
    
    private int Luggage_id;
    private String belongsto;
    private int weight_kilo;
    private double capacity_lt;
    private static int lastUsed_id = 500;
    

    public Luggage(String belongsto, int weight_kilo, double capacity_lt) {
        this.belongsto = belongsto;
        this.weight_kilo = weight_kilo;
        this.capacity_lt = capacity_lt;
        this.Luggage_id = lastUsed_id++;
    }

    public int getLuggage_id() {
        return Luggage_id;
    }

    public String getBelongsto() {
        return belongsto;
    }

    public int getWeight_kilo() {
        return weight_kilo;
    }

    public double getCapacity_lt() {
        return capacity_lt;
    }

    @Override
    public String toString() {
        return "ID: "+ Luggage_id +"\nBelongs to: " + belongsto + "\nWeight of the Luggage: " + weight_kilo + "\nCapacity of the Luggage " + capacity_lt + " liters";
    }
    
    
    
}
