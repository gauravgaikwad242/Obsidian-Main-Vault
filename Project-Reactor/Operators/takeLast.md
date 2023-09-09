- like take(n) operator only gets first n elements
- takeLast(n) takes last n elements
```java
/**  
 * `number_service()` returns 300 numbers, but you only need last 100 numbers. */@Test  
public void not_a_binary_search() {  
    Flux<Integer> numbers = number_service().takeLast(100)  
            //todo: change this line only  
            ;  
  
    StepVerifier.create(numbers)  
                .expectNextMatches(i -> i >= 200)  
                .expectNextCount(99)  
                .verifyComplete();  
}
```

