- gets only first value from flux 
```java
/**  
 * This service returns many elements, but you are only interested in the first one. * Also, service is very fragile, if you pull more than needed, you may brake it. * * This time no blocking. Use only one operator. */@Test  
public void watch_out_for_the_spiders() {  
    //todo: change code as you need  
    Mono<String> firstResult = Mono.empty();  
    firstResult = fragile_service().next();  
  
    //don't change code below  
    StepVerifier.create(firstResult)  
                .expectNext("watch_out")  
                .verifyComplete();  
}
```
