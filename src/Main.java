public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(4, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // делить на ноль нельзя
        calc.println.accept(c);

    }
}