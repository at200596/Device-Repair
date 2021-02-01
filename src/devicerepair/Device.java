package devicerepair;
//superclass so protected
//template for laptop and phone classes

public class Device {

    protected String identificationCode;
    protected String makeAndModel;
    protected String owner;
    protected String problemDescription;
    protected String repairNotes;
    protected int priority;

    public Device(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        this.identificationCode = identificationCode;
        this.makeAndModel = makeAndModel;
        this.owner = owner;
        this.problemDescription = problemDescription;
        this.repairNotes = repairNotes;
        this.priority = priority;
    }

    
    public String toString() {
        return  identificationCode + ", " + makeAndModel + ", " + owner + ", " + problemDescription + ", " + repairNotes + ", " + priority;
    }
    

    
    

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public void setRepairNotes(String repairNotes) {
        this.repairNotes = repairNotes;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getRepairNotes() {
        return repairNotes;
    }

    public String getOwner() {
        return owner;
    }

    public int getPriority() {
        return priority;
    }

}
