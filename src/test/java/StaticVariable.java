public class StaticVariable {

    // Static variable
    static int counter = 0;

    // Instance variable
    int instanceVariable;

    // Constructor
    public StaticVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
        counter++; // Increment the static variable each time a new instance is created
    }

    // Method to access and print the values of both static and instance variables
    public void printVariables() {
        System.out.println("Static variable counter: " + counter);
        System.out.println("Instance variable value: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Creating instances of the class
        StaticVariable obj1 = new StaticVariable(10);
        StaticVariable obj2 = new StaticVariable(20);

        // Calling the printVariables method for each instance
        System.out.println("Object 1:");
        obj1.printVariables();

        System.out.println("\nObject 2:");
        obj2.printVariables();
    }
}