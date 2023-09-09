- here only the data with datatype string will be collected to flux
- filters the data for datatypes
- 
```java

public Flux<Object> mashed_data_service() {  
    return Flux.just("1", new LinkedList<String>(), new AtomicReference<String>(), "String.class", String.class);  
}

@Test  
public void needle_in_a_haystack() {  
    Flux<String> strings =  
    mashed_data_service()  
            .ofType(String.class)  
            //todo: change this line only  
            ;  
  
    StepVerifier.create(strings)  
                .expectNext("1", "String.class")  
                .verifyComplete();  
}
```