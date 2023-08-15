- **Introduction:** The `debounceTime` operator in RxJS is a powerful tool for controlling the rate of emissions from an observable stream. 
- It introduces a delay before emitting a value, and if another value arrives within that delay, the previous value is discarded.
- This is particularly useful for scenarios where you want to wait for a pause in activity before reacting to changes.
- **How it Works:** The `debounceTime` operator introduces a delay period (`timeInMilliseconds`) after receiving a value. 
- **During this period, if another value is emitted, the previous value is discarded, and the timer is reset. Only when the delay period elapses without any new values, the current value is emitted**.
- EVEN IF VALUE IS EMMITED IT ONLY ALLOWS IT TO PASS IN PIPELINE WHEN THE TIME IS COMPLETED

- USED IN SEARCH
- THE VALUES EMMITED IN BETWEEN IS LOST
```
    this.searchGroup
    .get('debounceTimeDemo')?.valueChanges
    .pipe(
      debounceTime(700) //stps the data from going ahead for a time limit check console and type in input box
      )
    .subscribe(data=>{
      console.log(`%c search string :${data}`,"color:orange")
      this.debounceTimeI = data;
    })
```