- if the producer doesnt emit valule and is empty then return some value
```java
    //to use when the an empty value can be produce
    //so to fallback on that
    public static void main(String[] args) {
        Flux.range(1,10)
                .filter(i -> i>10)
                .defaultIfEmpty(-1) //this value will be published
                .subscribe(Utility.subscriber());
    }
```