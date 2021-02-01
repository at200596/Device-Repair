package devicerepair;

import java.util.ArrayList;

public class Laptop extends Device {

    private ArrayList<Component> Components = new ArrayList<>();

    public Laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
    }

    public ArrayList<Component> getComponents() {
        return Components;
    }

    public void addComponent(Component component) {
        Components.add(component);
    }

    public void deleteComponent(int index) {
        if (index >= 0 && index < Components.size()) {
            Components.remove(index);
        }
    }

    public static void priorityRank() {

    }

    public static boolean isChargeable() {

        return false; //or true dk yet
    }

}
