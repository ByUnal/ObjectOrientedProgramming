package Memory;


public abstract class MemoryDefict {
    
    String deficit_id;
    String memory_loss;
    public static int totalDeficit;

    public MemoryDefict(String deficit_id, String memory_loss) {
        this.deficit_id = deficit_id;
        this.memory_loss = memory_loss;
    }

    @Override
    public String toString() {
        return  "Deficit ID = " + deficit_id + "\nMemory_loss = " + memory_loss;
    }

    public String getDeficit_id() {
        return deficit_id;
    }

    public static int getTotalDeficit() {
        return totalDeficit;
    }
    
    
}
