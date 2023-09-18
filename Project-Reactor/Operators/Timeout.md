
- publisher doesnt emmit value if it fails to emit value in time out time
- we can give some fallback logic 
- for eg, wait for an api call to complete for 1min if we dont get data, do some other logic

```java
    //what to do if producer dosent deliver any value for long time
    //non blocking out of box like delayElements
    public static void main(String[] args) {
        System.out.println("before");
        getOrders()
                .timeout(Duration.ofSeconds(3), fallBack())
                .subscribe(Utility.subscriber());
        System.out.println("after");
        Utility.threadSleep(5);
    }
    public static Flux<Integer> getOrders(){
        return Flux.range(1,5)
                .delayElements(Duration.ofSeconds(5));
    }
    public static Flux<Integer> fallBack(){
        return Flux.range(100,6);
    }
```