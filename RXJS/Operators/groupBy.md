- returns observable of groups
- here data is grouped by lastName key from object
```js
dataSource
  .pipe(
    groupBy((user) => user.lastName),
    mergeMap((data) => data.pipe(reduce((acc, cur) => [...acc, cur], [])))
  )
  .subscribe({
    next: (data) => {
      console.log("data receive", data);
      finalData = [...finalData, data];
    },
    error: (error) => {
      console.log("error occured" + error);
    },
    complete: () => {
      console.log("completed");
      fs.writeFileSync("output.json", JSON.stringify(finalData));
    },
  });
```