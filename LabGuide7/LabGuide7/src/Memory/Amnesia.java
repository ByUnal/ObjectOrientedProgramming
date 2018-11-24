
package Memory;

import ClinicalCase.ClinicalCase;


public class Amnesia extends  MemoryDefict{
    
    private String amnesia_type;
    private String cause;
    private String location;
    private ClinicalCase clin;
    private static int total_amnesia = 0;


    public Amnesia(String amnesia_type, String cause, String location, String deficit_id, String memory_loss,String patient_id, String patient_name, String patient_surname,int age, String gender) {
        super(deficit_id, memory_loss);
        this.amnesia_type = amnesia_type;
        this.cause = cause;
        this.location = location;
        this.clin = new ClinicalCase(patient_id, patient_name, patient_surname, age, gender);
        total_amnesia++;
    }
    

    @Override
    public String toString() {
        return super.toString() + clin + "\nAmnesia_type = " + amnesia_type + "\nCause = " + cause + "\nLocation = " + location + "\n\n";
    }

    public static int getTotal_amnesia() {
        return total_amnesia;
    }
    
    
}
