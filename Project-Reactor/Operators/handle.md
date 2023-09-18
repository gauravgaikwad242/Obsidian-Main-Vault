- handle - map which doesnt have to emmit value always or can filter the value

```java
     public static void handle(Integer integer){

         Flux.range(1, 100)

                    .handle((nextVal, synchronousSink)->{

                        if(nextVal % 2 == 0){

                            synchronousSink.next(nextVal);

                        }

                    })

                    .subscribeOn(Schedulers.boundedElastic())

                    .subscribe((data)->{

                        System.out.println(data);

                    });

     }


```

```java
        //handle is combination of filter and map
        //not literally but we can impletment as filter and map
        //it takes dataemitted & synchronousssink(similar to generate) as an argument

        //USEFUL IF WE GET AN FLUX AS RETURN TYPE AND WE WANT TO APPLY LOGIC SIMILART TO GENERATE
        Flux
        .generate((SynchronousSink<String> syncSink) -> syncSink.next(LocalDateTime.now().toString()))
        .handle((dataemitted, syncSink)->{
            syncSink.next(dataemitted);
            if(dataemitted.contains("56")){ //if date contains 56 then stop
                syncSink.complete();
            }
        }).subscribe(Utility.onNext());
```