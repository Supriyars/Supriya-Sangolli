
import java.util.Scanner;

public class Problem1 {

    static class Calculator {
        double a, b;

        public Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double calculate(String operation) {
            switch (operation.toLowerCase()) {
                case "add":
                    return a + b;
                case "subtract":
                    return a - b;
                case "multiply":
                    return a * b;
                case "divide":
                    if (b == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    return a / b;
                default:
                    throw new IllegalArgumentException("Invalid operation");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String op = scanner.next();

        Calculator calc = new Calculator(a, b);
        try {
            System.out.println("Result: " + calc.calculate(op));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
