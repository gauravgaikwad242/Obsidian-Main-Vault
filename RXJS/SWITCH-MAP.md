- SAME AS [[MERGE-MAP]] BUT 
- AS IT RECIVES NEW DATA IT CANCELLA PREVIOUS  SUBSCRIPTION
- _instantly switch to next_
-  everything same as mergemap but  
- instead of parallel execution it instantly switches to next data
-  BUT IT COMPLETES THE LAST SUBSCIBER AND CANCELLS ALL THE PREVIOUS SUBSCIPTION
 ```
   switchMapWithSwapi(){
    let searchStrings = of("a","yoda","obi","r2","b")
    let pipedSearch = searchStrings.pipe(
      switchMap((string)=>{
        return this.swapi.searchPeople(string)
      })
    )
      pipedSearch.subscribe((data:HttpResponse<any>)=>{
        console.log('character',data.body);
  
      })
  }
```
