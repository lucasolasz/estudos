import java.util.Arrays;
import java.util.List;

public class OperacoesTerminaisStream {

    private static List<Integer> integers = Arrays.asList(-1, 0, 1, 3, 5, 7, 9, 12);
    private static List<Integer> integers2 = Arrays.asList(7, 7);

    public static void main(String[] args) throws Exception {

        // Todos os elementos é igual a 1?
        System.out.println("All match: " + integers.stream().allMatch(i -> i == 1));
        // Todos os elementos é igual a 7?
        System.out.println("All match 2: " + integers2.stream().allMatch(i -> i == 7));

        // Nenhum elemento é igual a 0
        System.out.println("None match 2: " + integers.stream().noneMatch(i -> i == 0));

        // retorna algum elemento da stream. Como é sequencial, geralmente retorna o
        // primeiro elemento
        System.out.println("Find any: " + integers.stream().findAny().get());
        // Retorna o primeiro elemento da stream que atenda à condição.
        System.out.println(
                "Find any primeiro elemento > 2: " + integers.stream().filter(i -> i > 2).findAny().get());

        // Retorna o primeiro elemento da lista
        System.out.println("Find first: " + integers.stream().findFirst().get());

        // Reduce precisa receber como parametro uma Interface funcional do tipo
        // BynaryOperator. Neste caso ele realiza somatorio. O que ele faz: Inicia a
        // contagem em 100 e soma com o somatorio total da lista
        System.out.println("Reduce somatorio: " + integers.stream().reduce(100, Integer::sum));

        // Realiza subtração com binary operator. O que ele faz: Inicia a
        // contagem em 100 e substrai com o somatorio total da lista
        System.out.println("Reduce subtração: " + integers.stream().reduce(100, (x, y) -> x - y));

        // somatorio de todos os itens da lista
        System.out.println("Método sum: " + integers.stream().mapToInt(i -> i).sum());

        // Imprime todos os elementos da lista mas nao segue a ordem. Da a impressão que
        // esta na ordem, mas em listas maiores ele se perde.
        integers.stream().forEach(System.out::println);

        // Imprime todos os elementos da lista e segue a ordem
        integers.forEach(i -> System.out.println(i));

    }
}
