package Memory;

import ClinicalCase.ClinicalCase;

public class Alzheimer extends MemoryDefict {

   private String declining_area;
   private static int totalAlzheimer = 0;
   private ClinicalCase clin;

    public Alzheimer(String declining_area, String deficit_id, String memory_loss, String patient_id, String patient_name, String patient_surname, int age, String gender) {
        super(deficit_id, memory_loss);
        this.declining_area = declining_area;
        this.clin = new ClinicalCase(patient_id,patient_name,patient_surname,age,gender);
        totalAlzheimer++;
    }

    @Override
    public String toString() {
        return super.toString() + clin + "\nDeclining Area = " + declining_area +"\n\n";
    }

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }
    
}
