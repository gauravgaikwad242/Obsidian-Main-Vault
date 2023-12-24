
```java 
@GetMapping(path = "/stream-flux", produces = MediaType.TEXT_EVENT_STREAM_VALUE) public Flux<String> streamFlux() { return Flux.interval(Duration.ofSeconds(1)) .map(sequence -> "Flux - " + LocalTime.now().toString()); }
```