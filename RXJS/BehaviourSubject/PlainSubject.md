- it is truely hot,
- that means even if no one is subscribed to it the data will be emmitted 
- if no one has subscribed the data will be lost

```ts
    let carsPublisher = new Subject(); //special observable//hot
    carsPublisher.next('tata');
    carsPublisher.next('honda');
    carsPublisher.next('maruti');

    const carsSubscriber1 = carsPublisher.subscribe((car) => {console.log(car);});
    carsPublisher.next('tesla');
    const carsSubscriber2 = carsPublisher.subscribe((car) => {console.log(car);});
    carsPublisher.next('google car');
```

- in above code the first three logs will be missed as we are subscribing after 
```
//actual logs
tesla
google car
google car

```
