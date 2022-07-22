package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        tryToDivide(calc, a, b);
        b = calc.minus.apply(2, 1);
        tryToDivide(calc, a, b);
    }

    private static void tryToDivide(Calculator calc, int a, int b) {
        try {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (Exception e) {
            System.out.println("Возникла ошибка: " + e.getMessage());
        }
    }
}