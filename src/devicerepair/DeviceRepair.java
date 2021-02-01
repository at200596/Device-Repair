
package devicerepair;
import java.util.Scanner;

public class DeviceRepair {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Device myNewDevice = new Device("12345", "Lenovo 3", "Ailise", "Smashed Screen", "Not started yet", 1);
        
        System.out.println(myNewDevice.toString());
        
        mainMenu();
        
    }
    
    public static void mainMenu() {
        while(true){
            System.out.println("Please select an option");
            System.out.println("1 - ");
            System.out.println("2 - ");
            System.out.println("0 - ");
            int userChoice = input.nextInt();
            
            switch(userChoice){
                case 1:
                    System.out.println("You chose 1");
                    break;
                case 2:
                    System.out.println("You chose 2");
                    break;
                case 0:
                    System.exit(0);
            }
            
            
        }
    }
    
}
//String thing = myNewDevice.toString();
//        
//        
//String[] device =  thing.split(", ");
//System.out.println(device[4]);
