
- unsure about the pracitcal use 
- but fetches 75% of the elements which are requested and then fetches next items
```java
        //TODO : WHY DO WE NEED THIS ASK COPILOT
        Flux.range(1,1000)
                .log()
//                .limitRate(50)// no of elements fetched in //75 %
                .limitRate(100, 90) // 100 elements 90 % // use 0 as lowtide for 100 fetch
                .subscribe(Utility.subscriber());
```