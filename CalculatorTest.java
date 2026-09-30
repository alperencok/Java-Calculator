public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("sumInt(1, 5) -> " + c.sumInt(1, 5));
        System.out.println("sumDouble(1, 5) -> " + c.sumDouble(1, 5));

        System.out.println("sum(1.0, 5.5) -> " + c.sum(1.0, 5.5));
        System.out.println("sum(1, 5) -> " + c.sum(1, 5));
        System.out.println("sum(1.0, 5) -> " + c.sum(1.0, 5));
        System.out.println("sum(1.0, 2.0, 3.0) -> " + c.sum(1.0, 2.0, 3.0));
    }
}
