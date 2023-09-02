- similar to [[PlainSubject]] but instead of all data getting lost if no one has subscribed the last emmitted data will be always emitted

```ts
    let scorePublisher = new BehaviorSubject('0runs'); //empty array is default value
    scorePublisher.next('2runs');
    scorePublisher.next('3runs');//one before value and alll after value
    const runsSubscriber1 = scorePublisher.subscribe((car) => {
      console.log(car);
    });
    scorePublisher.next('4runs');
    const runsSubscriber2 = scorePublisher.subscribe((car) => {
      console.log(car);
    });
    scorePublisher.next('7runs');
    scorePublisher.next('12runs');
```

- logs
```
3runs //last emitted
4runs
4runs //last emmited 
7runs
7runs
12runs
12runs
```
