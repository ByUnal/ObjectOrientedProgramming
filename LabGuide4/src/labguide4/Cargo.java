package labguide4;

import java.util.Scanner;

public class Cargo {
    
    public static void main(String[] args) {
        
        LuggageList luggageList=new LuggageList();
        Scanner input = new Scanner(System.in);
        int weight = 0;
        String belongsto,id, search, getCapacity;
        double width,height,length;
        double capacity;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Luggage no."+ (i + 1) + ":");
            
            System.out.println("Belongs to:");
            belongsto = input.nextLine();
            
            System.out.println("Enter weight in kilos:");
            weight = input.nextInt();
            
            getCapacity = input.nextLine();
            System.out.println("Enter capacity like Width:Height:Length");
            getCapacity = input.nextLine();
            
            String[] values = getCapacity.split(":");
            
            width = Double.parseDouble(values[0]);
            height = Double.parseDouble(values[1]);
            length = Double.parseDouble(values[2]);
          
            capacity = (width * height * length) / 1000;
            
            Luggage myLug = new Luggage(belongsto,weight, capacity);
            
            
            if(LuggageList.addLuggage(myLug))
                System.out.println("The luggage belonging to: " + myLug.getBelongsto() + " is added to the list.");
           
            else
                System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
           
        }
        
        System.out.println("Here is a list of the luggages (using toString() method of list object)...");
        luggageList.display();
        System.out.println("--------------------------------------------");
        
        
        System.out.println("Which Luggage do you Like to delete?");
        System.out.println("Enter an ID: "); id = input.nextLine();
        luggageList.removeLuggage(id);
        luggageList.display();
        
        System.out.println("---------------------------------------");
        System.out.println("Whose luggage would you like to search?");
         search = input.nextLine();
        luggageList.getLuggage(search);
        
        System.out.println("---------------------------------------");
        luggageList.getHighestCapacityLuggage();
        
    }
    
}
