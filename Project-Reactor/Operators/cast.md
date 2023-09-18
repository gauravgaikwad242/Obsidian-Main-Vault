- for type casting

```java
    public Flux<String> generateNames(){
        return Flux.generate(stringSynchronousSink -> {
            System.out.println("generated fresh");
            Util.sleepSeconds(1);
            String name = Util.faker().name().firstName();
            list.add(name);
            stringSynchronousSink.next(name);
        })
                .cast(String.class) //***
                .startWith(getFromCache());
    }


```
```
```
```java
//eqivalent to 
.map((data)->{
return (String)(data);
})
```