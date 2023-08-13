- to debug the code 
- non terminal
- The `peek` operation in the Java Stream API is an intermediate operation that allows you to apply a specified action to each element of the stream while still keeping the original elements intact. 
- It's often used for debugging, logging, or observing the elements as they flow through the stream pipeline.
```
import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = numbers.stream()
                .peek(num -> System.out.println("Before doubling: " + num))
                .map(num -> num * 2)
                .peek(num -> System.out.println("After doubling: " + num))
                .toList();

        System.out.println("Doubled numbers: " + doubledNumbers);
    }
}

```