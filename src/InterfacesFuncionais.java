import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfacesFuncionais {

    // Tipos: Consumer, Predicate, Supplier, UnaryOperator, BynaryOperator, Function

    // Consumer - Possui uma entrada e nenhuma saida / sem retorno. Tipo de entrada
    // definido na declaração
    private static Consumer<Integer> showInteger = (x) -> System.out.println("Test consumer: " + x);

    // Predicate - Possui uma entrada e o retorno sempre sera boolleano. Tipo de
    // entrada definido na declaração
    private static Predicate<Integer> isPair = (x) -> x % 2 == 0;

    //Supplier - Representa uma funcao sem entrada e que sempre tem um retorno , que é definido na declaração
    private static Supplier<Integer> showNumber = () -> 12345;

    //UnaryOperator - A entrada e a saída é a que está definida na declaração
    private static UnaryOperator<Integer> multiplyerByTwo = (x) -> x *2;

    //BynaryOperator - Duas entradas com apenas uma saída
    private static BinaryOperator<Integer> multiplyBetween = (x, y) -> x * y;

    //Function- Define o tipo de entrada e o tipo de saída
    private static Function<Integer, Integer> multiplyByTwoFunction = (x) -> x * 2;


    public static void main(String[] args) throws Exception {
       Integer num = 2;
        showInteger.accept(num);
        System.out.println("Teste predicate: " + isPair.test(num));
        System.out.println("Teste supplier: " + showNumber.get());
        System.out.println("Teste unary: " + multiplyerByTwo.apply(num));
        System.out.println("Teste binary: " + multiplyBetween.apply(num, 10));
        System.out.println("Teste function : " + multiplyByTwoFunction.apply(num));

    }
}
