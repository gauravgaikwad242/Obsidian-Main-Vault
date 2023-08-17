- SIMILAR TO [[MERGE-MAP]] 
- SIMILAR TO [[SWITCH-MAP]]
- BUT IT COMPLETES THE FIRST SUBSCIBER AND IGNORE ALL THE INCOMING SUBSCIPTION
- This is test for autocomplete but autoco
```js
  exhaustMapWithSwapi(){
    let searchStrings = of("yoda","a","obi","r2","b")
    let pipedSearch = searchStrings.pipe(
      exhaustMap((string)=>{
        return this.swapi.searchPeople(string)
      })
    )
      pipedSearch.subscribe((data:HttpResponse<any>)=>{
        console.log('character',data.body);
      })
  }
```