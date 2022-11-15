public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        int b = calc.minus.apply(1,1);
        calc.println.accept(b);

        //Деление целого числа на ноль приводит к исключению ArithmeticException
        //Решение 1: возвращение ошибки RunTimeException вместо ArithmeticException
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

        //Решение 2: использовать числа с плавающей точкой (double, float), исключение ArithmeticException не будет выдано
        //В ответе получим "Infinity" (или NaN при делении 0(ноля) на 0(ноль) )
        double d = calc.devideDoble.apply((double) a,(double) b);
        System.out.println(d);

        float e = calc.devideFloat.apply((float) a, (float) b);
        System.out.println(e);
    }
}