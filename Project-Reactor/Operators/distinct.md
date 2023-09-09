- to filter the duplicate records or values
```java
public Flux<String> duplicated_records_service() {  
    return Flux.just("1","2","1","3","4","5","3","3");  
}

/**  
 * This service may return duplicated data. Filter out all the duplicates from the sequence. */@Test  
public void economical() {  
    Flux<String> items = duplicated_records_service().distinct()  
            //todo: change this line only, use only one operator  
            ;  
  
    StepVerifier.create(items)  
                .expectNext("1", "2", "3", "4", "5")  
                .verifyComplete();  
}
```