public class calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        String operation = "^";
        int result = 0;

        if (operation.equals("^")) {
            result = power(a, b);
            System.out.println(a + " ^ " + b + " = " + result);
        } else if (operation.equals("+")) {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation.equals("-")) {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation.equals("*")) {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (operation.equals("/")) {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else if (operation.equals("%")) {
            result = a % b;
            System.out.println(a + " % " + b + " = " + result);
        } else {
            System.out.println("Неизвестная операция.");
        }
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
