import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyFirstProgramm {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0,10)
                .boxed()
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
