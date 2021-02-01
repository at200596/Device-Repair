
package devicerepair;


public class Component {
    private String componentName;
    private double cost;

    public Component(String componentName, double cost) {
        this.componentName = componentName;
        this.cost = cost;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public double getCode() {
        return cost;
    }

    public void setCode(double code) {
        this.cost = cost;
    }
    
    
    
}
