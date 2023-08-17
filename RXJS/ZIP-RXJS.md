- The `zip` operator in RxJS is a powerful tool for combining multiple streams of data into a single stream.
- It operates by taking one item from each input stream and emitting a combined tuple of those items. 
- This can be very useful for scenarios where you need to synchronize and process data from different sources simultaneously.
- **How it Works:** The `zip` operator waits for all input streams to emit a value. 
- Once all input streams emit a value, it takes one value from each input stream and emits them as a tuple. The emission only happens when all input streams have emitted a value simultaneously. 
- **After emitting the tuple, the operator resets and waits for the next set of values from all input stream**
- syntax1
```js
    let publisher1 = this.swapi.searchPeople("a") //this is an api call
    let publisher2 = this.swapi.searchPeople("obi") //this is an api call
    let publisher3 = of('bang', 'chennai', 'hyderabad');


    let finalPublisher = zip(publisher1, publisher2, publisher3);
    finalPublisher.subscribe((data) => console.log(data));
    
```

```js
    let finalPublisher2 = zip(publisher1, publisher2, publisher3);
    finalPublisher.subscribe(([data1,data2,data3]) =>{
      console.log(data1)
      console.log(data2)
      console.log(data3)
    });
```

```
ouput will be : only first emitted values from each observables
i.e. chennai from publicsher3 will nott be emmited
```
