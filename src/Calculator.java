import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    /*
    * Так как деление на 0 - это арифметическая ошибка Java не позволит нам выполнить это действие и выдаст Exception!
    * Для решение этой проблемы мы будем возвращать 0 если происходит деление на 0
    */
    public BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Integer> isPositive = x -> x > 0;

    public Consumer<Integer> println = System.out::println;
}
