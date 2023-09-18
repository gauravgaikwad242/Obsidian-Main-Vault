- like pipe operator in rxjs
- it takes chain of operators as arguments 
- so some common logic or chain will can be written once and used again and again

```java
        //TRANSFORM IS LIKE A CUSTOM OPERATOR
        //CAN BE USED IF SAME LOGIC IS APPLIED MULTIPLE TIM
        Flux.range(1,100)
                .transform(customOperationWhichIsRepetative())
                .subscribe(Utility.subscriber());


    }
    public static Function<Flux<Integer>,Flux<Integer>> customOperationWhichIsRepetative(){
        return flux -> flux
                .filter(i -> i%2!=0)
                .map(i-> i+5 )
                .doOnDiscard(Integer.class, p -> System.out.println("discarded because of even"+p));
    }
```