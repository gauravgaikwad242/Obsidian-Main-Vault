#onErrorReturn
#onErrorResume
#onErrorContinue

1. onErrorReturn - returns some error value and stops
2. onErrorResume - we can return some fallback logic like some other producer or api call
3. onErrorContinue - keeps emmitting elements on even after getting error

```java
    public static void main(String[] args) {
        Flux.range(1,10)
                .log()
                .map(i -> 10/(5-i)) // so we will get error when 10/0
//                .onErrorReturn(-1) //returns -1 when error occurs and STOPS

//                .onErrorResume(e -> {
//                    System.out.println("error occured "+e.getMessage());
//                    return fallback(); //here we can write fall back logic
//                }) //also stops on error STOPS

                .onErrorContinue((throwable, o) -> {
                    System.out.println("error happened"+ throwable.getMessage());
                    System.out.println("___because of the published value is ____"+o);
                }) //keeps emmitting elements on even after getting error
                .subscribe(Utility.subscriber());
    }
    public static  Mono<Integer> fallback(){
        return Mono.fromSupplier(()-> -1);
    }
```