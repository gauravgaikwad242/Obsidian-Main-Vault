- The `boxed()` method is often used in the context of primitive streams (`IntStream`, `LongStream`, `DoubleStream`) to convert them into corresponding object streams (`Stream<Integer>`, `Stream<Long>`, `Stream<Double>`). 
- This is useful when you need to switch from working with primitive types to working with objects, 
- for example, when you want to perform certain operations that are only available on object streams.

```
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        List<Integer> integerList = intStream
                .boxed() // Convert to Stream<Integer>
                .collect(Collectors.toList());

        System.out.println(integerList); // Output: [1, 2, 3, 4, 5]
    }
}

```
