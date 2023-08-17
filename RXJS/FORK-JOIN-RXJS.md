- **Introduction:** The `forkJoin` operator in RxJS is a powerful tool for combining multiple observables and waiting for all of them to complete before emitting a single result. 
- It's particularly useful for scenarios where you need to gather results from multiple sources and process them together as a single unit.
- **How it Works:** The `forkJoin` operator takes multiple observables as input and waits for all of them to complete. Once all input observables have emitted their final values and completed, `forkJoin` emits an array containing the collected values in the order of the input observables.
- **FAILS IF ANY ONE OF THEM FAILS**
- **PARALLEL**
- **emmits data as all are completed**

```js
    //
    forkJoin([this.runObservable(5000),this.runObservable(2000)]).subscribe((data)=>{
      console.log('forkjoin',data);
    })
```

- SEE [[MERGE]]