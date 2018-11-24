package LabGuide7;

import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDefict;
import java.util.ArrayList;


public class InfoClass {
    
    ArrayList<MemoryDefict> memoryArrayList = new ArrayList<>();
    
    
    public void addMemory(MemoryDefict def){
        memoryArrayList.add(def);
    }
    
    public String getAllMemory(){
        String disp = "";
        
        if (memoryArrayList.size() != 0) 
            for (int i = 0; i < memoryArrayList.size(); i++)
                disp += memoryArrayList.get(i).toString();
            
        return disp;
        
    }
    
    public String getAmnesia(){
        String dispAmnesia = "";
        
        for (int i = 0; i < memoryArrayList.size(); i++)     
            if(memoryArrayList.get(i) instanceof Amnesia)
                dispAmnesia += memoryArrayList.get(i).toString();
        
        return dispAmnesia;
    }
    
    public String getAlzheimer(){
        String dispAlzheimer = "";
        
        for (int i = 0; i < memoryArrayList.size(); i++)     
            if(memoryArrayList.get(i) instanceof Alzheimer)
                dispAlzheimer += memoryArrayList.get(i).toString();
        
        return dispAlzheimer;
    }
    
    public MemoryDefict searchMemory(String id){
        
        for (int i = 0; i < memoryArrayList.size(); i++) {
            
            if(memoryArrayList.get(i).getDeficit_id().equals(id))
                return memoryArrayList.get(i);
        }
        
        return null;
    }
    
    public String showTotalMemory(){
        
        int total_Amn = Amnesia.getTotal_amnesia();
        int total_Alz = Alzheimer.getTotalAlzheimer();
        MemoryDefict.totalDeficit = total_Alz + total_Amn;
        
        return "Total Deficit :" + MemoryDefict.getTotalDeficit() + "\nTotal Amnesics : " + total_Amn + "\nTotal Alzheimics : " + total_Alz;
    }
    
}
