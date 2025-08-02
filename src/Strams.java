import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strams {

    private static List<String> listaStrings = Arrays.asList("Maria", "João");
    private static List<Integer> listaInteger = Arrays.asList(1, 3,5 );

    //Outras streams : DoubleStream, ,IntStream, LongStream
   public static void main(String[] args) throws Exception {
        Stream<String> stringStream = listaStrings.stream();    
        System.out.println("Count strings: " + stringStream.count());
        
        IntStream intStream = listaInteger.stream().mapToInt(i -> i);
        System.out.println("Count integer: " + intStream.count());


    }
}
