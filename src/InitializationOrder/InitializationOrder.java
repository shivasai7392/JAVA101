package InitializationOrder;
public class InitializationOrder {
    // 3. Instance Field Initialization (happens during object instantiation, before instance blocks)
    String instanceField = "Instance Field Initialized";

    // 1. Static Field Initialization (happens during class loading, before static blocks)
    static String staticField = "Static Field Initialized";

    // 2. Static Block (executed once when the class is loaded)
    static {
        System.out.println("--- Static Block 1 Executed ---");
        System.out.println("Static Field in Static Block: " + staticField);
        // staticField = "Static Field Modified in Static Block"; // Can modify static fields
    }

    // Another Static Block (if present, executed after previous static block)
    static {
        System.out.println("--- Static Block 2 Executed ---");
    }

    // 4. Instance Block (executed every time an object is created, before the constructor)
    {
        System.out.println("--- Instance Block 1 Executed ---");
        System.out.println("Instance Field in Instance Block: " + instanceField);
        // instanceField = "Instance Field Modified in Instance Block"; // Can modify instance fields
    }

    // Another Instance Block (if present, executed after previous instance block)
    {
        System.out.println("--- Instance Block 2 Executed ---");
    }

    // 5. Constructor (executed last, every time an object is created)
    public InitializationOrder() {
        System.out.println("--- Constructor Executed ---");
        System.out.println("Instance Field in Constructor: " + instanceField);
        System.out.println("Static Field in Constructor: " + staticField);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        System.out.println("\nCreating first object:");
        InitializationOrder obj1 = new InitializationOrder();

        System.out.println("\nCreating second object:");
        InitializationOrder obj2 = new InitializationOrder();

        System.out.println("\nMain method finished.");
    }
}