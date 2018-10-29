
package labguide4;


public class LuggageList {
    
    public static final int MAX_COUNT = 5;
    public static final int MAX_KILOS = 50;
    private static Luggage[] myLuggage = new Luggage[MAX_COUNT];
    private static int total_Kilo;
    private static int total_LuggageCount = 0;
    
    
    public static boolean addLuggage(Luggage l)
    {
        if( total_LuggageCount < MAX_COUNT && total_Kilo < MAX_KILOS)
        {
            myLuggage[total_LuggageCount++] = l;
            total_Kilo = l.getWeight_kilo();
            
            return true;
        }
        return false;
    }
    
    public boolean removeLuggage(String idLugg){
        
        int id = Integer.parseInt(idLugg);
        
        
        for (int i = 0; i < total_LuggageCount; i++) 
        {
            if( id == myLuggage[i].getLuggage_id()){
                System.out.println("The Luggage belonging to:" + myLuggage[i].getBelongsto() + " is removed.");
                myLuggage[i] = myLuggage[total_LuggageCount - 1];
                myLuggage[total_LuggageCount - 1] = null;
                total_LuggageCount--;
                return true;
            }
        }
        return false;
    }
    
    public Luggage getLuggage(String belongsto){
        for (int i = 0; i < total_LuggageCount; i++)
            if ( myLuggage[i].getBelongsto().equals(belongsto) )
            {
                System.out.println("Here is the luggage you were looking for...");
                System.out.println(myLuggage[i].toString());
                return myLuggage[i];
            }
        return null;
    }

    public Luggage[] getAll(Luggage[] luggages){
        return luggages;
    }
    
    public Luggage getHighestCapacityLuggage(){
        int index = 0;
        
        for (int i = 0; i < total_LuggageCount; i++) {
            if (myLuggage[i].getCapacity_lt() >= myLuggage[index].getCapacity_lt())
                index = i;  
        }
         System.out.println("The luggage belonging to: " + myLuggage[index].getBelongsto() + " has the highest capacity of " + myLuggage[index].getCapacity_lt());
           
        return myLuggage[index];
    }
    
    
    public void display(){
        for (int i = 0; i < total_LuggageCount; i++) 
            System.out.println(myLuggage[i].toString());
        }
    }
