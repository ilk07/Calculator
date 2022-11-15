import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> devide = (x, y) -> {
        //Не можем использовать тернарный оператор, поскольку он должен возвращать значение для true и false логического выражения,
        //а мы возвращаем не значение, а RuntimeException для делителя равного 0, поэтому используем "if"
        if(y != 0){
            return x / y;
        } else {
            throw new RuntimeException("На ноль делить нельзя!");
        }
    };

    BinaryOperator<Double> devideDoble = (x, y) -> (y != 0) ? x / y : x / 0.00;
    BinaryOperator<Float> devideFloat = (x, y) -> (y != 0) ? x / y : x / 0;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    UnaryOperator<Integer> pow = x -> x * x;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
