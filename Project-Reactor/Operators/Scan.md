
```txt
- in simple words it is like reduce 
- but in reduce we only return the last value i.e. final value of accumulator
- so in the end we reduce the flux to mono (mon<T>)
- but with scan each value of accumulator is returned stored in the flux so return type of scan is Flux<T>
```
In Project Reactor, the `scan` operator is used to provide insights into the internal state changes of a reactive stream. It allows you to observe events and perform actions when certain conditions are met during the processing of elements in the stream. The `scan` operator is similar to the `reduce` operator in that it accumulates values, but it also allows you to access and manipulate the state.

The signature of the `scan` operator looks like this:

```java
Mono<T> scan(BiFunction<T, T, T> accumulator)
```

or for Flux:

```java
Flux<T> scan(BiFunction<T, T, T> accumulator)
```

Here, `accumulator` is a function that takes two arguments: the current accumulated value (`T`) and the new element arriving in the stream (`T`). It returns a new accumulated value, which will be used in the next call.

Here are a few examples of how you can use the `scan` operator:

### Example 1: Accumulate Sum

```java
Flux<Integer> source = Flux.just(1, 2, 3, 4, 5);

Flux<Integer> sumAccumulator = source.scan((acc, next) -> acc + next);

sumAccumulator.subscribe(System.out::println);
```

Output:
```
1
3
6
10
15
```

### Example 2: Finding Maximum Value

```java
Flux<Integer> source = Flux.just(4, 2, 7, 5, 9, 1);

Mono<Integer> max = source.scan(Integer.MIN_VALUE, (acc, next) -> Math.max(acc, next)).last();

max.subscribe(System.out::println);
```

Output:
```
9
```

### Example 3: Calculating Running Average

```java
Flux<Integer> source = Flux.just(1, 2, 3, 4, 5);

Flux<Double> averageAccumulator = source
    .scan(new Tuple2<>(0, 0), (acc, next) -> Tuples.of(acc.getT1() + next, acc.getT2() + 1))
    .map(tuple -> (double) tuple.getT1() / tuple.getT2());

averageAccumulator.subscribe(System.out::println);
```

Output:
```
1.0
1.5
2.0
2.5
3.0
```

In this example, we're calculating the running average of a stream of integers.

Keep in mind that the `scan` operator can be powerful for maintaining stateful computations, but it can also make your code more complex. Use it judiciously and make sure it adds value to your specific use case.