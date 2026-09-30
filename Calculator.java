public class Calculator {

    int sumInt(int a, int b) {
        return a + b;
    }

    double sumDouble(double a, double b) {
        return a + b;
    }

    // Overloaded method: sum with two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Erroneous implementation: Changing only parameter names does NOT overload a method.
    // The compiler distinguishes overloaded methods by parameter types and count, not names.
    // int sum(int m, int n) {
    //     return m + n;
    // }

    // Overloaded method: sum with two doubles
    double sum(double a, double b) {
        return a + b;
    }

    // Overloaded method: sum with three doubles
    double sum(double a, double b, double c) {
        return a + b + c;
    }

    // Overloaded method: sum with a double and an int
    double sum(double a, int b) {
        System.out.println("Invoked sum(double, int)");
        return a + b;
    }

    /* Incorrect implementation of overloading:
     * Overloading CANNOT be performed by changing only the return type!
     * The parameter list (number, type, or order of parameters) must differ.
    int sum(double a, int b) {
        System.out.println("double+int");
        return (int) a;
    }
    */
}
