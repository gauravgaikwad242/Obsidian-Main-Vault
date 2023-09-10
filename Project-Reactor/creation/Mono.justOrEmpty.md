
- used to handle empty and null values
```java
/**  
 * Emit potentially null value that you already have. */@Test  
public void potentially_null_mono() {  
    String potentiallyNull = null;  
    Mono<String> potentiallyNullMono = Mono.justOrEmpty(potentiallyNull); //todo change this line only  
  
    StepVerifier.create(potentiallyNullMono)  
                .verifyComplete();  
}
```

```java
/**  
 * Emit potentially null value that you already have. */@Test  
public void potentially_null_mono() {  
    String potentiallyNull = null;  
    Mono<String> potentiallyNullMono = Mono.justOrEmpty(Optional.ofNullable(potentiallyNull)); //todo change this line only  
  
    StepVerifier.create(potentiallyNullMono)  
                .verifyComplete();  
}
```

