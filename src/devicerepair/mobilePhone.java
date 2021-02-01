
package devicerepair;


public class mobilePhone extends Device{

    public mobilePhone(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
    }
    

    
    
    public static int priorityRank(){
        
        return 0;
    }
    
}
