class TestClass {
    void greet(String parametro) {
        System.out.println("Hello, World!");
    }
}

public class LVTIClass {

    // attributes ---- here

    public static void main(String[] args) {
        // LVTI = Local Variable Type Inference

        // Explicit
        String name = "Nahum";

        // Implicit - Inference
        var lastName = "Acuna";
        var edad = 17;

        System.out.println(lastName.getClass());

        // *********************************** //

        var object = new TestClass();
        var names = new String[]{"Test", "test1", "test2"};
    }
}
