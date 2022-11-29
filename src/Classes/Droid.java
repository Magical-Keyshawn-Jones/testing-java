package Classes;
public class Droid {
    // Instance/State
    String name;
    int batteryLevel;
  
    // Constructor
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    // Methods
    public void performTask(String task) {
      System.out.println(name+ " is performing task: " +task);
      batteryLevel -= 10;
      System.out.println("Battery level is at " +batteryLevel+ "%");
    }
  
    public void energyReport() {
      System.out.println(batteryLevel);
    }
  
    public String toString() {
      return "Hello, I'm the droid: " + name;
    }
  
    public static void main(String[] args) {
      Droid droid1 = new Droid("Codey");
      droid1.energyReport();
      System.out.println(droid1.name);
      droid1.performTask("Cooking food");
    }
  }