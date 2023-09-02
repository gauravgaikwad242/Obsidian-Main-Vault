- all the data will be cached and emmitted for each new subscriber
```ts
  replaySubject(){
    let scorePublisher = new ReplaySubject();
    scorePublisher.next('2runs');//all data
    const runsSubscriber1 = scorePublisher.subscribe((car) => {console.log(car);});
    scorePublisher.next('4runs');
    const runsSubscriber2 = scorePublisher.subscribe((car) => {console.log(car);});
    scorePublisher.next('7runs');
    scorePublisher.next('12runs');
  }

```

- logs
```
2runs //by 1
4runs //1
2runs //2
4runs //2
7runs //1
7runs //2
12runs //1
12runs //2
```
