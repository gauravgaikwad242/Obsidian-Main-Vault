- **PARALLEL**
- WORKS WITH OBSERVABLE OF OBSERVABLE
- mergemap get observable of observable and subscribes it and returns data  
- in simple words map will return observable object which we will have to subscribes again  
	but mergemap will subscribe the inner observables
- PARALLEL EXECUTION


```js
  mergeMapWithSwapi(){
    let searchStrings = of("a","yoda","obi","r2","b")
    let pipedSearch = searchStrings.pipe(
      mergeMap((string)=>{
        return this.swapi.searchPeople(string)
      })
    )
      pipedSearch.subscribe((data:HttpResponse<any>)=>{
        console.log('character',data.body);
      })
  }
```