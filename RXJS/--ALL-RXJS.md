- MERGEALL
- SWITCHLL
- EXHAUSTALL
- CONCATALL
- Are similar to their map counterpart [[MERGE-MAP]] etc. 
- but for **all we must provide higher order observable an **all doesnt take any arrow function
- in **map we can receive normal values and convert them into observable and map them 
- map takes arrow function as parameter

- map
```
  concatAllDemo(){

    const higherOrderObservable = of(
      this.swapi.searchPeople("obi"),
      this.swapi.searchPeople("yoda"),
      this.swapi.searchPeople("jo"),
      of('World'),
      of('RxJS')
    );



    // Flatten the higher-order Observable using concatAll

    const flattenedObservable = higherOrderObservable.pipe(concatAll());

  

    // Subscribe to the flattened Observable to receive the concatenated values

    flattenedObservable.subscribe((value) => {

      console.log(value); // Output the concatenated values: 'Hello', 'World', 'RxJS'

    });

  }
```