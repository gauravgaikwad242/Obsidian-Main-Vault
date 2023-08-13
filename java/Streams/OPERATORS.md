
Apart from `map` and `filter`, the Stream API in Java offers several other important operations that can be used to perform various data processing tasks. Some of these operations include:

1. **`flatMap`**: This operation is used to transform each element of a stream into a stream of other elements and then flattening the result. It's particularly useful when you have a nested structure and you want to work with its inner elements as a single flat stream. [[flatmap-streams]]

2. **`distinct`**: Removes duplicate elements from the stream based on their `equals` method. [[distinct-streams]]

3. **`sorted`**: Sorts the elements of the stream using either natural ordering or a specified comparator.[[sorted-stream]]

4. **`limit` and `skip`**: `limit` returns a stream with the first N elements, and `skip` skips the first N elements, producing a new stream. [[limit-skip-streams]]

5. **`anyMatch`, `allMatch`, and `noneMatch`**: These operations check whether any, all, or none of the elements in the stream satisfy a given condition.[[anymatch-allmatch-nonematch-streams]]

6. **`findFirst` and `findAny`**: These operations return an optional result representing the first element or any element in the stream, respectively. [[findfirst-findany-streams]]

7. **`reduce`**: As discussed earlier, this operation performs reduction operations like sum, max, min, etc., on the elements of the stream. [[reduce-streams]]

8. **`collect`**: This terminal operation accumulates the elements of a stream into a collection or a single value using a Collector. [[collect-streams]]

9. **`forEach`**: Performs an action on each element of the stream. It's a terminal operation and doesn't return a new stream. [[foreach-streams]]

10. **`peek`**: Applies an action to each element of the stream, similar to `forEach`, but it doesn't terminate the stream. It's often used for debugging and logging. [[peek-streams]]

11. **`min` and `max`**: These operations return the minimum or maximum element of the stream, based on natural ordering or a specified comparator. [[min-max-streams]]

12. **`groupingBy` and `partitioningBy`**: These collectors are used for grouping elements based on certain criteria into a map or a list. [[groupingby-partitionby-streams]]

13. **`joining`**: This collector concatenates the elements of the stream into a single string. [[joining-streams]]

14. **`toArray`**: Converts the elements of a stream into an array. [[to-array-streams]]
15. `boxed` : to convert primitive type stream into wrapper stream [[boxed-streams]]

These are just a few examples of the many operations available in the Stream API. Depending on your data processing needs, you can combine these operations to create complex data transformations and computations using streams.

