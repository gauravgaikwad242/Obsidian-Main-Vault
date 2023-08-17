-  everything same as [[MERGE-MAP]] but instead of parallel execution it will do it sequentially
- i.e receives observable and returns it with subscription
- SUBSCRIBES TO NEXT VALUE ONLY IF PREVIOUS SUBSCRIPTION IS COMPLETED
```js
  concatMapWithSwapi(){
    let searchStrings = of("a","yoda","obi","r2","b")
    let pipedSearch = searchStrings.pipe(
      concatMap((string)=>{
        return this.swapi.searchPeople(string)
      })
    )
      pipedSearch.subscribe((data:HttpResponse<any>)=>{
        console.log('character',data.body);

      })
  }
```
